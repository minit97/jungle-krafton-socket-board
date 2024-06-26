package com.example.krafton_springboot.api.auth.service;

import com.example.krafton_springboot.api.auth.dto.SignupDto;
import com.example.krafton_springboot.api.auth.dto.UserDto;
import com.example.krafton_springboot.api.auth.model.User;
import com.example.krafton_springboot.api.auth.repository.UserRepository;
import com.example.krafton_springboot.exception.securityException.DuplicateMemberException;
import com.example.krafton_springboot.exception.securityException.NotFoundMemberException;
import com.example.krafton_springboot.util.SecurityUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.krafton_springboot.api.auth.model.Role.ROLE_USER;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Transactional
    public UserDto signup(SignupDto signupDto) {
        if (userRepository.findOneWithAuthoritiesByUsername(signupDto.getUsername()).orElse(null) != null) {
            throw new DuplicateMemberException("이미 가입되어 있는 유저입니다.");
        }

        User user = User.builder()
                .username(signupDto.getUsername())
                .password(passwordEncoder.encode(signupDto.getPassword()))
                .nickname(signupDto.getNickname())
                .authorities(ROLE_USER)
                .remainedTime(0)
                .build();

        return UserDto.from(userRepository.save(user));
    }


    @Transactional(readOnly = true)
    public UserDto getMyUserWithAuthorities() {
        return UserDto.from(
                SecurityUtil.getCurrentUsername()
                        .flatMap(userRepository::findOneWithAuthoritiesByUsername)
                        .orElseThrow(() -> new NotFoundMemberException("Member not found"))
        );
    }

    @Transactional(readOnly = true)
    public UserDto getUserWithAuthorities(String username) {
        return UserDto.from(userRepository.findOneWithAuthoritiesByUsername(username).orElse(null));
    }
}
