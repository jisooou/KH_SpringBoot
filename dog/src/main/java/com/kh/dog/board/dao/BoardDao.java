package com.kh.dog.board.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
    public void findBoardAll() {
        System.out.println("BoardDao.findBoardAll~~~~~~~~~~~~~");
    }

    public void findBoardByNo() {
        System.out.println("BoardDao.findBoardByNo~~~~~~~~~~~~~");
    }

    public void insertBoard() {
        System.out.println("BoardDao.insertBoard~~~~~~~~~~~~~");
    }
}
