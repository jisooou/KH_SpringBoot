package com.kh.app10.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberDao dao;
    private final BCryptPasswordEncoder encoder;

    public int join(MemberVo vo) {
//        암호화 작업
//        encoder -> 암호화 처리 할 수 있다.
        String encStr = encoder.encode(vo.getPwd());
        vo.setPwd(encStr);
        return dao.join(vo);
    }

    public MemberVo login(MemberVo vo) {
        MemberVo loginVo = dao.login(vo);
//        일치 여부 = 객체.암호문이랑평문이랑비교하기(암호문,평문)
        boolean isMatch = encoder.matches(vo.getPwd(), loginVo.getPwd());
        return isMatch ? loginVo : null;
    }
}
