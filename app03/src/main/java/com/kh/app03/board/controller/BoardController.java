package com.kh.app03.board.controller;

import com.kh.app03.board.service.BoardService;
import com.kh.app03.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
//1. 필수 Argument를 전달받는 생성자를 만들기 위한 어노테이션(lombok이 제공하는 어노테이션)
//2. final 필드만 전달받는 생성자
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

//    게시글 작성 (화면)
    @GetMapping("write")
    public String write(){
        return "board/write";
    }

    //    게시글 작성
    @PostMapping("write")
    public String write(BoardVo vo){
//        data

//        service
        int result = service.write(vo);

//        result
//        작성성공 시, 게시글 목록으로 화면 전환
//        실패 시, 에러 페이지로 화면 전환
        if(result != 1){
            return "common/error";
        }
//        redirect 할 때, redirect 작성 후, 경로를 작성해 준다.
        return "redirect:board/list";
    }

//    게시글 목록 조회
    @GetMapping("list")
    public void getBoardList(){

    }

//    게시글 상세 조회
    @GetMapping("detail")
    public void getBoardByNo(){

    }

//    게시글 삭제
    @GetMapping("delete")
    public void deleteByNo(String no){

    }

//    게시글 수정
    @PostMapping("edit")
    public void editBoard(){

    }
}
