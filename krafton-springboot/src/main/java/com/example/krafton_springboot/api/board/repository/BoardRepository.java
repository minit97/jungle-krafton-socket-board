package com.example.krafton_springboot.api.board.repository;


import com.example.krafton_springboot.api.board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {
}
