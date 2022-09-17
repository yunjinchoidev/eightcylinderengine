package com.server.eightcylinderengine.user.service;

import com.server.eightcylinderengine.user.mapper.UserMapper;
import com.server.eightcylinderengine.user.model.UserDto;
import com.server.eightcylinderengine.user.model.UserRequestDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Slf4j
public class UserService {


    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserDto> listUsers(){
        log.info("userMapper.listUsers");
        return userMapper.listUsers();
    }

    public UserDto saveUser(UserRequestDto param){
        log.info("userMapper.insertUser");
        log.info("param.toString : " + param.toString());
        userMapper.insertUser(param);
        UserDto result = new UserDto();
        result.setEmail(param.getEmail());
        return result;
    }

    public UserDto modifyUser(UserRequestDto param){
        log.info("userMapper.updateUser");
        log.info("param.toString : " + param.toString());
        userMapper.updateUser(param);
        UserDto result = new UserDto();
        result.setEmail(param.getEmail());
        return result;
    }

    public UserDto removeUser(UserRequestDto param){
        log.info("userMapper.insertUser");
        log.info("param.toString : " + param.toString());
        userMapper.deleteUser(param);
        UserDto result = new UserDto();
        result.setEmail(param.getEmail());
        return result;
    }


}
