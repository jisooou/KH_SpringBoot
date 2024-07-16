package com.kh.app99.member.controller;

import com.kh.app99.member.service.MemberService;
import com.kh.app99.member.vo.MemberVo;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Member;
import java.util.HashMap;

@Controller
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

//    public void test01(){
//        MemberVo vo = new MemberVo();
//        vo.setId("");
//        vo.setPwd("");
//
//        MemberVo vo = MemberVo.builder()
//                .id("")
//                .pwd("")
//                .build();
//    }

    //회원가입 (화면)
    @GetMapping("join")
    public String join(){
        return "member/join";
    }

    //회원가입
    @PostMapping("join")
    public String join(MemberVo vo){

        int result = service.join(vo);

        if(result != 1){
            throw new RuntimeException("[M-000] 회원가입 실패~");
        }

        return "redirect:/home";
    }

    //로그인 (화면)
    @GetMapping("login")
    public String login(){
        return "member/login";
    }

    //로그인
    @PostMapping("login")
    public String login(MemberVo vo, HttpSession session){

       MemberVo loginMemberVo = service.login(vo);

        if(loginMemberVo == null){
            throw new RuntimeException("[M-000] 로그인 실패~");
        }

        session.setAttribute("loginMemberVo", loginMemberVo);

        return "redirect:/home";
    }

    //회원 탈퇴
    @GetMapping("quit")
    @ResponseBody
    public HashMap<String, String> quit(String num){

        int result = service.quit(num);

        if(result != 1){
            throw new RuntimeException();
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("msg", "quit ok.");

        return map;
    }





}
