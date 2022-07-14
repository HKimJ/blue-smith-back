package com.example.blueSmith.user.controller;

import com.example.blueSmith.user.dto.UserDto;
import com.example.blueSmith.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController
{
    final UserService userService;

    @ResponseBody
    @PostMapping("/signUp")
    public void signUp(@RequestBody Map<String, Object> map)
    {
        Map<String, Object> result = map;
        userService.signUp(result);
    }

    @ResponseBody
    @PostMapping("/signIn")
    public UserDto signIn(@RequestBody Map<String, Object> map)
    {
        Map<String, Object> result = map;
        return userService.signIn(result);
    }

}
