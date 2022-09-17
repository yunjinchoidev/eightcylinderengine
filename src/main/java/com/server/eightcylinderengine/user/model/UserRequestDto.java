package com.server.eightcylinderengine.user.model;

import lombok.Data;

@Data
public class UserRequestDto {
    private String email; // 이메일
    private String password; // 비밀번호
}
