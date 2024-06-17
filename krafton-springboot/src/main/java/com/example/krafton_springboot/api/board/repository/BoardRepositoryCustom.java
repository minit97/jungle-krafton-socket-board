package com.example.krafton_springboot.api.board.repository;


import com.example.krafton_springboot.api.board.dto.request.BoardSearchReqDto;
import com.example.krafton_springboot.api.board.model.Board;

import java.util.List;

public interface BoardRepositoryCustom {

    List<Board> getList(BoardSearchReqDto boardSearchReqDto);
}
