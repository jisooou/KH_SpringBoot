package com.kh.app02.board.mapper;

import com.kh.app02.board.vo.BoardVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM BOARD")
    List<BoardVo> getBoardList(RowBounds rb);

    @Insert("INSERT INTO BOARD ( TITLE ,CONTENT ,WRITER ) VALUES ( #{param1} ,#{param2} ,#{param3} )")
    int write(String a, String b, String c);
}
