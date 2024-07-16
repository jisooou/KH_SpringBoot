package com.kh.app99.notice.controller;

import com.kh.app99.notice.service.NoticeService;
import com.kh.app99.notice.vo.NoticeVo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/notice")
@RequiredArgsConstructor
public class NoticeApiController {

    private final NoticeService service;

    //공지사항 목록조회
    @GetMapping("list")
    public List<NoticeVo> getNoticeList(){
        List<NoticeVo> voList =service.getNoticeList();
        return voList;
    }

    //공지사항 상세조회
    @GetMapping
    public NoticeVo getNoticeByNo(String num){
        NoticeVo vo = service.getNoticeByNo(num);
        return vo;
    }

    //공지사항 작성하기
    @PostMapping
    public ResponseEntity<String> write(@RequestBody NoticeVo vo){

        //TODO 나중에 로그인한 유저 정보를 변경하도록.
        vo.setWriterNo("1");
        int result = service.write(vo);

//        Map<String,String> responseMap = new HashMap<>();
//        responseMap.put("msg", "write success~");
//        responseMap.put("status", "1");
//
//        if(result != 1){
//            responseMap.put("msg", "write fail~");
//            responseMap.put("status", "-1");
//        }
//        return responseMap;

        if(result == 1){
            return ResponseEntity.ok("작성하기 성공~");
        }else{
            return ResponseEntity.internalServerError().body("작성하기 실패~");
        }
    }

    //공지사항 수정
    @PutMapping
    public String edit(NoticeVo vo){
        int result = service.edit(vo);
        if(result != 1){
            return "common/error";
        }
        return "notice/edit";
    }

    //공지사항 삭제하기
    @DeleteMapping
    public void delete(String num){
        int result = service.delete(num);
    }
}
