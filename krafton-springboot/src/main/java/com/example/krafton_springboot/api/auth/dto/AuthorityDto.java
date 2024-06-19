package com.example.krafton_springboot.api.auth.dto;

import com.example.krafton_springboot.api.auth.model.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorityDto {
    private Role authorityName;

    @Builder
    public AuthorityDto(Role authorityName) {
        this.authorityName = authorityName;
    }
}