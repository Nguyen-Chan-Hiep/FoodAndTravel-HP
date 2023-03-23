
package com.example.detaithuctap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService myDBAauthenticationService;

    public void configure(AuthenticationManagerBuilder auth) throws Exception {

        // Các User trong Database
        auth.userDetailsService(myDBAauthenticationService).passwordEncoder (passwordEncoder ());

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable().cors().disable();
        http.authorizeRequests ().antMatchers ("/", "/home", "/food", "/food-detail", "/news", "/contact", "/blog-detail", "/searchnews", "/travel", "/travel-destination", "/travel-destination-detail", "/travel-hotel", "/travel-tour").permitAll ()
                .anyRequest ().authenticated ()
                .and ().formLogin ()
                .defaultSuccessUrl ("/checkLogin").failureUrl ("/login?error=false")
                .and ().logout ().logoutUrl("/j_spring_security_logout").deleteCookies("JSESSIONID")
                .invalidateHttpSession(true).logoutSuccessUrl ("/home")
                .permitAll ();
    }

    @Override
    public void configure (WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**", "/addressimg/**", "/detailimg/**", "/css/**", "/img/**", "/fonts/**", "/error", "/list-mon-an-theo-loai-hinh/**");

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return  (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
