package com.example.blueSmith.user.mapper;

import com.example.blueSmith.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper
{
    void signUp(Map signUpmap);
}
