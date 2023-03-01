package com.example.detaithuctap.auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyUserDetail implements UserDetails {

    private int id;

    private String userName, passWord;
    private List<GrantedAuthority> authorities;

    public MyUserDetail(int id, String name, String pass, List<GrantedAuthority> authorities){
        this.id = id;
        this.userName = name;
        this.passWord = pass;
        this.authorities = authorities;
    }

    public int getId () {
        return id;
    }

    public MyUserDetail(){}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities () {
        return authorities;
    }

    @Override
    public String getPassword () {
        return passWord;
    }

    @Override
    public String getUsername () {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired () {
        return true;
    }

    @Override
    public boolean isAccountNonLocked () {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired () {
        return true;
    }

    @Override
    public boolean isEnabled () {
        return true;
    }
}
