package com.kh.app.board.service;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardDao dao;

    public List<BoardVo> getBoardList() {

//        비즈니스 로직

//        dao 호출
        List<BoardVo> voList = dao.getBoardList();
        return voList;
    }
}
