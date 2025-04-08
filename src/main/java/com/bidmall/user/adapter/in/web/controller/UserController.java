package com.bidmall.user.adapter.in.web.controller;

import com.bidmall.user.adapter.in.web.dto.command.LoginCommand;
import com.bidmall.user.adapter.in.web.dto.command.SignUpCommand;
import com.bidmall.user.adapter.in.web.dto.request.LoginRequest;
import com.bidmall.user.adapter.in.web.dto.request.SignUpRequest;
import com.bidmall.user.adapter.in.web.dto.response.LoginResponse;
import com.bidmall.user.adapter.in.web.mapper.UserWebMapper;
import com.bidmall.user.application.port.in.UserUseCase;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
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

  @PostMapping("/signUp")
  public void signUp(@RequestBody SignUpRequest signUpRequest) {
    SignUpCommand signUpCommand = userMapper.signUpToCommand(signUpRequest);
    userUseCase.signUp(signUpCommand);
  }

  @DeleteMapping()
  public void deleteUser() {
    // note. 현재 사용자의 정보를 가져오는 코드 필요 / 현재 임의 지정
    Long userId = 1L;
    userUseCase.delete(userId);

  }
}
