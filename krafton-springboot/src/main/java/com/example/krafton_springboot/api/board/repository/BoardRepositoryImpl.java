package com.example.krafton_springboot.api.board.repository;

import com.example.krafton_springboot.api.board.dto.request.BoardSearchReqDto;
import com.example.krafton_springboot.api.board.model.Board;
import com.example.krafton_springboot.api.board.model.QBoard;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.krafton_springboot.api.board.model.QBoard.board;

@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;


    @Override
    public List<Board> getList(BoardSearchReqDto boardSearchReqDto) {
        return jpaQueryFactory.selectFrom(QBoard.board)
                .limit(boardSearchReqDto.getSize())
                .offset(boardSearchReqDto.getOffset())
                .orderBy(QBoard.board.id.desc())
                .fetch();
    }
}
