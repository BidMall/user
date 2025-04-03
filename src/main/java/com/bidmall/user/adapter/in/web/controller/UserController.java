package com.bidmall.user.adapter.in.web.controller;

import com.bidmall.user.adapter.in.web.dto.command.LoginCommand;
import com.bidmall.user.adapter.in.web.dto.request.LoginRequest;
import com.bidmall.user.adapter.in.web.dto.response.LoginResponse;
import com.bidmall.user.adapter.in.web.mapper.UserWebMapper;
import com.bidmall.user.application.port.in.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

  private final UserWebMapper userMapper;
  private final UserUseCase userUseCase;

  @PostMapping("/login")
  public LoginResponse login(@RequestBody LoginRequest loginRequest) {
    LoginCommand loginCommand = userMapper.loginToCommand(loginRequest);
    return userUseCase.login(loginCommand);
  }
}
