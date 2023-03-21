package com.example.detaithuctap.Controller.MonAn;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.detaithuctap.auth.MyUserDetail;

@Controller
public class LogoutController {

	@GetMapping("/checkLogout")
    public String checkLogout(HttpSession session){
		MyUserDetail myUserDetail = (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
		myUserDetail = null;
        session.setAttribute ("user", null);
        session.setMaxInactiveInterval(0);
        return "redirect:/home";
    }
}
