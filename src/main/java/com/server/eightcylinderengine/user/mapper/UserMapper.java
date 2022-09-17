package com.server.eightcylinderengine.user.mapper;

import com.server.eightcylinderengine.user.model.UserDto;
import com.server.eightcylinderengine.user.model.UserRequestDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<UserDto> listUsers();

    public int insertUser(UserRequestDto param);

    public int updateUser(UserRequestDto param);

    public int deleteUser(UserRequestDto param);

}
