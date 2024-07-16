package com.kh.app10.member;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

    @Insert("""
            INSERT INTO MEMBER
            (
                NO
                , ID
                , PWD
                , NICK
            )
            VALUES
            (
                SEQ_MEMBER.NEXTVAL
                , #{id}
                , #{pwd}
                , #{nick}
            )
            """)
    int join(MemberVo vo);


    @Select("""
            SELECT
            *
            FROM MEMBER
            WHERE ID = #{id}
            """)
    MemberVo login(MemberVo vo);
}
