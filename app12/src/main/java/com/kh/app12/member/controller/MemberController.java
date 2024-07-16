package com.kh.app12.member.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

    @GetMapping("login")
    public String login(HttpServletResponse resp){
//        쿠키 만들기 - key와 value
        Cookie c = new Cookie("k01", "v01");
//        10초가 지나면 쿠키가 사라진다.
        c.setMaxAge(10);
        c.setPath("/");
        resp.addCookie(c);
        return "member/login";
    }

}
