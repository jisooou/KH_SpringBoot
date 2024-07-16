package com.kh.app03.board.dao;

import com.kh.app03.board.mapper.BoardMapper;
import com.kh.app03.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardDao {

    private final BoardMapper mapper;

    public int write(BoardVo vo) {
//        SQL
        return mapper.write(vo);
    }
}
