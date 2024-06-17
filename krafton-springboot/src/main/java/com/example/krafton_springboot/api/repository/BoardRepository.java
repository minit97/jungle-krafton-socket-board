package com.example.krafton_springboot.api.repository;

import com.example.krafton_springboot.api.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
