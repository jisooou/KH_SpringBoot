package com.kh.app09.todo.mapper;

import com.kh.app09.todo.vo.TodoVo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TodoMapper {
    @Select("SELECT * FROM TODO")
    List<TodoVo> getTodoList();

    @Insert("INSERT INTO TODO ( NO , CONTENT ) VALUES ( SEQ_TODO.NEXTVAL , #{content} )")
    int insertTodo(TodoVo vo);

    @Select("SELECT *\n" +
            "FROM TODO\n" +
            "WHERE NO = #{no}")
    TodoVo getTodoByNo(String no);

    @Update("UPDATE TODO SET CONTENT = #{content} WHERE NO = #{no}")
    int edit(TodoVo vo);

    @Delete("DELETE FROM TODO \n" +
            "WHERE NO = #{no}")
    int delete(String no);
}
