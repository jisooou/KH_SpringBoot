package com.kh.app99.notice.mapper;

import com.kh.app99.notice.vo.NoticeVo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NoticeMapper {


    @Select("SELECT * FROM NOTICE")
    List<NoticeVo> getNoticeList();

    @Select("SELECT * FROM NOTICE WHERE NO = #{no}")
    NoticeVo getNoticeByNo(String num);

    @Insert("INSERT INTO NOTICE(NO, TITLE, CONTENT, WRITER_NO, HIT) VALUES(SEQ_NOTICE.NEXTVAL, #{title}, #{content}, #{writerNo}, #{hit})")
    int write(NoticeVo vo);

    @Update("UPDATE NOTICE SET CONTENT = #{content} WHERE NO = #{no}")
    int edit(NoticeVo vo);

    @Delete("DELETE FROM NOTICE WHERE NO = #{no}")
    int delete(String num);

}
