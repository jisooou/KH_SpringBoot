package com.kh.app01.board.controller;

import com.kh.app01.board.service.BoardService;
import com.kh.app01.board.vo.BoardVo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService service;

    @GetMapping("board/list")
    public void getBoardList(){
//        data

//        service
        List<BoardVo> voList = service.getBoardList();
        for (BoardVo boardVo : voList) {
            System.out.println("boardVo = " + boardVo);
        }

//        result (==view)
    }

    @PostMapping("board/write")
    public void write(BoardVo vo){

//        service
        int result = service.write(vo);
        System.out.println("result = " + result);
        
//        result == view
    }


}
