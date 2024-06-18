package com.example.krafton_springboot.api.auth.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenDto {

    private String token;

    @Builder
    public TokenDto(String token) {
        this.token = token;
    }
}

