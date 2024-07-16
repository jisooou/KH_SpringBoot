package com.kh.app08.board.service;

import com.kh.app08.board.dao.BoardDao;
import com.kh.app08.member.dao.MemberDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardDao dao;

    public void list() {
        System.out.println("BoardService.list");
        dao.list();
    }
}
