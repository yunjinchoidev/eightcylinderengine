package com.server.eightcylinderengine.user.model;

import lombok.Data;

@Data
public class UserDto {
    private String email =null; // 이메일
    private String password =null; // 비밀번호
}
