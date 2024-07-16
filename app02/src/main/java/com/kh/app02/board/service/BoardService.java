package com.kh.app02.board.service;

import com.kh.app02.board.dao.BoardDao;
import com.kh.app02.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardDao dao;

    public List<BoardVo> getBoardList() {
        return dao.getBoardList();
    }

    public int write(BoardVo vo) {
        return dao.write(vo);
    }
}
