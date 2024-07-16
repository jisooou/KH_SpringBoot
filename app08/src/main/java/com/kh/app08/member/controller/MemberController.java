package com.kh.app08.member.controller;

import com.kh.app08.member.dao.MemberDao;
import com.kh.app08.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {

    private final MemberService service;

    @GetMapping("list")
    @ResponseBody
    public String list(){
        System.out.println("MemberController.list");
        service.list();
        return "member list~~~~~";
    }

}
