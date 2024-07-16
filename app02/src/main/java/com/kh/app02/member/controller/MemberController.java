package com.kh.app02.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

//    회원가입 화면
    @GetMapping("member/join")
    public void join(){

    }

//    로그인 화면
    @GetMapping("member/login")
    public String login(){
        return "member/login";
    }

}
