package com.example.blueSmith.user.service;

import com.example.blueSmith.user.dto.UserDto;

import java.util.Map;

public interface UserService
{
    public void signUp(Map<String, Object> result);
    public UserDto signIn(Map<String, Object> result);
}
