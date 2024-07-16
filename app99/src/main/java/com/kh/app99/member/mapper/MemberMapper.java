package com.kh.app99.member.mapper;

import com.kh.app99.member.vo.MemberVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MemberMapper {

    @Insert("INSERT INTO MEMBER ( NO , ID , PWD , NICK ) VALUES ( SEQ_MEMBER.NEXTVAL , #{id} , #{pwd} , #{nick} )")
    int join(MemberVo vo);

    @Select("SELECT NO, ID , PWD , NICK FROM MEMBER WHERE ID = #{id} AND PWD = #{pwd}")
    MemberVo login(MemberVo vo);

    @Update("UPDATE MEMBER SET DEL_YN = 'Y' WHERE NO = #{num}")
    int quit(String num);
}
