package com.example.krafton_springboot.s3;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AwsS3 {
    private String key;         // 객체이름
    private String path;        // 해당 객체의 절대 경로

    @Builder
    public AwsS3(String key, String path) {
        this.key = key;
        this.path = path;
    }
}