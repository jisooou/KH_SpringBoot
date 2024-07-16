package com.kh.app.board.controller;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

//        result == view
    }

}
