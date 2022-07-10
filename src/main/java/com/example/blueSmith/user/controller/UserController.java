package com.example.blueSmith.user.controller;

import com.example.blueSmith.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController
{
    final UserService userService;

    @PostMapping("/signUp")
    public void signUp(@Param("email") String email,
                       @Param("nickname") String nickname,
                       @Param("password") String password,
                       @Param("passwordConfirm") String passwordConfirm)
    {
        System.out.println(email);
        userService.signUp(email, nickname, password, passwordConfirm);
    }
}
