package com.example.krafton_springboot.api.auth.dto;

import com.example.krafton_springboot.api.auth.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class UserDto {

    private String username;
    private String nickname;
    private List<AuthorityDto> authorityDtoList;

    @Builder
    public UserDto(String username, String nickname, List<AuthorityDto> authorityDtoList) {
        this.username = username;
        this.nickname = nickname;
        this.authorityDtoList = authorityDtoList;
    }

    public static UserDto from(User user) {
        if(user == null) return null;

        return UserDto.builder()
                .username(user.getUsername())
                .nickname(user.getNickname())
                .authorityDtoList(user.getAuthorities().stream()
                        .map(authority -> AuthorityDto.builder()
                                                        .authorityName(authority.getAuthorityName())
                                                        .build())
                        .collect(Collectors.toList()))
                .build();
    }
}
