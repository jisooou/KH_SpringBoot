package com.kh.app07.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class BoardController {

    @GetMapping("list")
    public String list(){
        //int x = 1/0;
        int[] arr = new int[3];
        System.out.println("arr[7] = " + arr[7]);
        return "board/list";
    }

}
