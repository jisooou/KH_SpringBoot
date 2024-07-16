package com.kh.app02.board.dao;

import com.kh.app02.board.mapper.BoardMapper;
import com.kh.app02.board.vo.BoardVo;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDao {

    @Autowired
    private BoardMapper mapper;

    public List<BoardVo> getBoardList() {
//        앞에 2개를 건너뛰고
        int offset = 2;
//        5개를 조회
        int limit = 5;
//        이때 RowBounds 사용
        RowBounds rb = new RowBounds(offset, limit);
        return mapper.getBoardList(rb);

    }

    public int write(BoardVo vo) {

        return mapper.write(vo.getTitle(), vo.getContent(), vo.getWriter());

    }
}
