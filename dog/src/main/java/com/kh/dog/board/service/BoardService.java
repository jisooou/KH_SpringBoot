package com.kh.dog.board.service;

import com.kh.dog.board.dao.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardDao dao;

    public void findBoardAll() {
        System.out.println("BoardService.findBoardAll~~~~~~~");
        dao.findBoardAll();
    }

    public void findBoardByNO() {
        System.out.println("BoardService.findBoardByNo~~~~~~~");
        dao.findBoardByNo();
    }

    public void insertBoard() {
        System.out.println("BoardService.inserBoard~~~~~~~");
        dao.insertBoard();
    }
}
