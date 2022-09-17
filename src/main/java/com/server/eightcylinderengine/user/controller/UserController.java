package com.server.eightcylinderengine.user.controller;

import com.server.eightcylinderengine.user.model.UserDto;
import com.server.eightcylinderengine.user.model.UserRequestDto;
import com.server.eightcylinderengine.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/list")
    public Object listUsers(){
        List<UserDto> userDtoList = userService.listUsers();

        if(null == userDtoList){
            return "Data가 없습니다.";
        }

        return userDtoList;
    }

    @PostMapping("/user")
    public Object saveUser(
            @RequestBody UserRequestDto param
            ){

        return userService.saveUser(param);
    }

    @PutMapping("/user")
    public Object modifyUser(
            @RequestBody UserRequestDto param
    ){

        return userService.modifyUser(param);
    }
    @DeleteMapping("/user/{email}")
    public Object removeUser(
            @PathVariable String email
    ){
        UserRequestDto param = new UserRequestDto();
        param.setEmail(email);
        return userService.removeUser(param);
    }




}
