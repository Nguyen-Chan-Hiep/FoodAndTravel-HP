package com.example.detaithuctap.auth;

import java.util.ArrayList;
import java.util.List;

import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Service.NguoiDung.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyDBAuthenticationService implements UserDetailsService {

    @Autowired
    private NguoiDungService nguoiDungService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        NguoiDung userInfo = nguoiDungService.getByName (username);
        if(userInfo == null){
            throw new UsernameNotFoundException ("Not found !!!");
        }
        List<GrantedAuthority> list = new ArrayList<> ();
        list.add (new SimpleGrantedAuthority (userInfo.getQuyen ()));
        return new MyUserDetail (userInfo.getId (), userInfo.getUsername (), userInfo.getPassword (), list);
    }
    
}