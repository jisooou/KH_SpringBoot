package com.kh.app11.board.dao;

import com.kh.app11.board.mapper.BoardMapper;
import com.kh.app11.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardDao {

    private final BoardMapper mapper;

    public int write(BoardVo vo) {
        return mapper.write(vo);
    }

    public BoardVo detail(String no) {
        return mapper.detail(no);
    }
}
