package com.example.blueSmith.user.service;

import com.example.blueSmith.user.dto.UserDto;
import com.example.blueSmith.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService
{
    final private UserMapper usermapper;

    public void signUp(String email, String nickname, String password, String passwordConfirm){
        System.out.println(email);
        System.out.println(nickname);
        if(!password.equals(passwordConfirm)) {
            System.out.println("비밀번호가 다름");
        }
        else {
            Map<String, String> signUpmap = new HashMap<String, String>();
            signUpmap.put("email", email);
            signUpmap.put("nickname", nickname);
            signUpmap.put("password", password);
            usermapper.signUp(signUpmap);
        }

    };
}
