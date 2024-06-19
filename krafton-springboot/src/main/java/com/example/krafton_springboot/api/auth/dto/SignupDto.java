package com.example.krafton_springboot.api.auth.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupDto {
    @NotNull
    @Size(min = 2, max = 50)
    private String username;

    @NotNull
    @Size(min = 2, max = 100)
    private String password;

    @NotNull
    @Size(min = 2, max = 50)
    private String nickname;

    @Builder
    public SignupDto(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}
