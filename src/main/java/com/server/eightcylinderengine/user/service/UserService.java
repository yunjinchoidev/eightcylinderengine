package com.server.eightcylinderengine.user.service;

import com.server.eightcylinderengine.user.mapper.UserMapper;
import com.server.eightcylinderengine.user.model.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {


    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserDto> listUsers(){
        return userMapper.listUsers();
    }


}
