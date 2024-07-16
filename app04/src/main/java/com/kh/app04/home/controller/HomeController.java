package com.kh.app04.home.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

    @Value("${atk}")
    private int atk;

    @Value("${def}")
    private int def;

    @Value("${email}")
    private String email;

    @Value("#{1+1}")
    private int result;

//    홈페이지 보여주기
    @GetMapping
    public String m01(){
        System.out.println("result = " + result);
        return "home";
    }

}
