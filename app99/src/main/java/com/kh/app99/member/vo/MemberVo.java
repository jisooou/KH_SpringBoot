package com.kh.app99.member.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberVo {

    private String no;
    private String id;
    private String pwd;
    private String nick;
    private String del_yn;
    private String enroll_date;

}
