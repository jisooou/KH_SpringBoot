package com.kh.app10.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

//    회원가입
    @PostMapping
    public int join(MemberVo vo){
        int result = service.join(vo);
        return result;
    }

//    로그인
    @GetMapping
    public MemberVo login(MemberVo vo){
        MemberVo loginVo = service.login(vo);
        return loginVo;
    }
}
