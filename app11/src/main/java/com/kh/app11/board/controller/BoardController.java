package com.kh.app11.board.controller;

import com.kh.app11.board.service.BoardService;
import com.kh.app11.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    //게시글 작성하기 화면
    @GetMapping("write")
    public String write(){
        return "board/write";
    }

    //게시글 작성하기
    @PostMapping("write")
    public String write(BoardVo vo){
        int result =  service.write(vo);
        return "redirect:/home";
    }

    //게시글 상세조회 화면
    @GetMapping("detail")
    public String detail(){
        return "board/detail";
    }

    //게시글 데이터 조회
    @GetMapping
    @ResponseBody
    public BoardVo getBoardByNo(String no){
        BoardVo vo = service.detail(no);
        return vo;
    }

    //사진 업로드
    @PostMapping("upload")
    @ResponseBody
    public String uploadFile(List<MultipartFile> fileList) throws IOException {

        MultipartFile file = fileList.get(0);
        File targetFile = new File("D:\\dev\\springBootWorkspace-class\\app11\\src\\main\\resources\\static\\img\\" + file.getOriginalFilename());
        file.transferTo(targetFile);

        return "http://192.168.40.60:5500/img/" + file.getOriginalFilename();
    }


}
