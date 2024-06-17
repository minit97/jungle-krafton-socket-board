package com.example.krafton_springboot.api.board.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardWriteReqDto {
    private String title;
    private String content;
}
