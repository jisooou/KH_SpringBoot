package com.kh.app04.board.controller;

import com.kh.app04.board.service.BoardService;
import com.kh.app04.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.desktop.SystemEventListener;
import java.io.File;
import java.util.List;
import java.util.Map;

@Controller
//@ResponseBody
//@RestController
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

//    게시글 작성 (화면)
    @GetMapping("write")
    public String write(){
        return "board/write";
    }
    
//    게시글 작성 (파일업로드 포함)
    @PostMapping("insert")
    public void insert(BoardVo vo) throws Exception{
        System.out.println("vo = " + vo);

        List<MultipartFile> attachmentList = vo.getAttachmentList();
        for (MultipartFile att : attachmentList) {
            System.out.println("att = " + att);
        }

//        ----파일 첨부하기----
//        MultipartFile att = vo.getAttachment();
//
//        String originName = att.getOriginalFilename();
//        File targetFile = new File("D:\\temp\\" + originName);
//
//        att.transferTo(targetFile);
    }

//    게시글 작성
    @PostMapping("write")
    @ResponseBody
    public int write(BoardVo vo){
        int result = service.write(vo);
//        System.out.println("result = " + result);
        return result;
    }

//    게시글 목록조회
    @GetMapping("list")
    @ResponseBody
    public List<BoardVo> getBoardList(){
        List<BoardVo> voList = service.getBoardList();
//        System.out.println("voList = " + voList);
        return voList;
    }

//    게시글 검색
    @GetMapping("search")
    @ResponseBody
    public List<BoardVo> getBoardList(@RequestParam Map<String, String> paramMap){
        System.out.println("paramMap = " + paramMap);
        List<BoardVo> voList = service.getBoardList(paramMap);
//        System.out.println("voList = " + voList);
        return voList;
    }


}
