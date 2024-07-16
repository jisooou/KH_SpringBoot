package com.kh.app14;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HelloMapper {

    @Select("SELECT * FROM kh_ljs")
    List<HelloVo> getList();

    @Insert("""
            INSERT INTO kh_ljs
            (
                MSG
            )
            VALUES
            (
                #{msg}
            )
            """)
    int insert(HelloVo vo);
}
