//package com.example.detaithuctap.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    UserDetailsService myDBAauthenticationService;
//
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        // Các User trong Database
//        auth.userDetailsService(myDBAauthenticationService).passwordEncoder (passwordEncoder ());
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.csrf().disable();
//        http.authorizeRequests ().antMatchers ("/", "/home").permitAll ();
//
//        http.authorizeRequests ()
//                .anyRequest ().authenticated ()
//                .and ().formLogin ()
//                .defaultSuccessUrl ("/checkLogin").failureUrl ("/login?error=false")
//                .and ().logout ().logoutUrl ("/checkLogout").logoutSuccessUrl ("/home")
//                .permitAll ();
//    }
//
//    @Override
//    public void configure (WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/js/**", "/css/**", "/img/**", "/fonts/**", "/error");
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return  (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//    }
//}