package com.server.eightcylinderengine.user.controller;

import com.server.eightcylinderengine.user.model.UserDto;
import com.server.eightcylinderengine.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/list")
    public Object listUsers(){
        List<UserDto> userDtoList = userService.listUsers();
        if(null == userDtoList){
            return "Data가 없습니다.";
        }
        return userDtoList;
    }


}
