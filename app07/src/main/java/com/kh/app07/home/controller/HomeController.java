package com.kh.app07.home.controller;

import com.kh.app07.annotation.HelloAno;
import com.kh.app07.annotation.KhAno;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
@KhAno
public class HomeController {

    @GetMapping
    public String home(Model model){
        model.addAttribute("msg" , "모델객체에담은메세지");
        return "home";
    }

}
