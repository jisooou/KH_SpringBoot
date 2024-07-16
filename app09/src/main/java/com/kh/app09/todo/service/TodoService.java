package com.kh.app09.todo.service;

import com.kh.app09.todo.dao.TodoDao;
import com.kh.app09.todo.vo.TodoVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoDao dao;


    public List<TodoVo> getTodoList(TodoVo vo) {
        return dao.getTodoList();
    }

    public int insertTodo(TodoVo vo) {
        return dao.insertTodo(vo);
    }

    public TodoVo getTodoByNo(String no) {
        return dao.getTodoByNo(no);
    }

    public int edit(TodoVo vo) {
        return dao.edit(vo);
    }

    public int delete(String no) {
        return dao.delete(no);
    }
}
