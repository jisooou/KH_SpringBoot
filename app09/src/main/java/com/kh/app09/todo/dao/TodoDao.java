package com.kh.app09.todo.dao;

import com.kh.app09.todo.mapper.TodoMapper;
import com.kh.app09.todo.vo.TodoVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TodoDao {

    private final TodoMapper mapper;

    public List<TodoVo> getTodoList() {
        return mapper.getTodoList();
    }

    public int insertTodo(TodoVo vo) {
        return mapper.insertTodo(vo);
    }

    public TodoVo getTodoByNo(String no) {
        return mapper.getTodoByNo(no);
    }

    public int edit(TodoVo vo) {
        return mapper.edit(vo);
    }

    public int delete(String no) {
        return mapper.delete(no);
    }
}
