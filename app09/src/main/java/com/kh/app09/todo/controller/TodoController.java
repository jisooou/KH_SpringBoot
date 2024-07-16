package com.kh.app09.todo.controller;

import com.kh.app09.todo.service.TodoService;
import com.kh.app09.todo.vo.TodoVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RestController
@RequestMapping("todo")
@RequiredArgsConstructor
@CrossOrigin
public class TodoController {

    private final TodoService service;

    //목록 조회
    @GetMapping
    public List<TodoVo> getTodoList(TodoVo vo){
        //System.out.println("TodoController.getTodoList");
        List<TodoVo> todoVoList = service.getTodoList(vo);
        return todoVoList;
    }

    //작성하기
    @PostMapping
    public int insertTodo(TodoVo vo){
        //System.out.println("TodoController.insertTodo");
        System.out.println("vo = " + vo);
        int result =  service.insertTodo(vo);
        return result;
    }

    //상세조회
    @GetMapping("detail")
    public TodoVo getTodoByNo(String no){
        TodoVo vo = service.getTodoByNo(no);
        return vo;
    }

    //수정
    @PutMapping
    public int edit(TodoVo vo){
        int result = service.edit(vo);
        return result;
    }

    //삭제
    @DeleteMapping
    public int delete(String no){
        int result = service.delete(no);
        return result;
    }

}
