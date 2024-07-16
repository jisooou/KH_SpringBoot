package com.kh.app02.board.controller;

import com.google.gson.Gson;
import com.kh.app02.board.service.BoardService;
import com.kh.app02.board.vo.BoardVo;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService service;

    @GetMapping("board/list")
    @ResponseBody
    public List<BoardVo> getBoardList() throws IOException {
//        service
        List<BoardVo> voList = service.getBoardList();
        for (BoardVo boardVo : voList) {
            System.out.println("boardVo = " + boardVo);
        }

        return voList;
    }

    @PostMapping ("board/write")
    public void write(BoardVo vo){
        int result =  service.write(vo);
        System.out.println("vo = " + vo);
    }

}
