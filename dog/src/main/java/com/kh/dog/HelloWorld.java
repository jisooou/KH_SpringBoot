package com.kh.dog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class HelloWorld {

    @GetMapping("hello")
    @ResponseBody
    public String m01(){
        System.out.println("HelloWorld.m01 called~~~~~~~");
        return "<h1>zzzz from spring~~~~~~~~~~</h1>";
    }

}
