package com.example.krafton_springboot.api.controller;

import com.example.krafton_springboot.api.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;


}
