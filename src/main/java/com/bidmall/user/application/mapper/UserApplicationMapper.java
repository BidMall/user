package com.bidmall.user.application.mapper;

import com.bidmall.user.adapter.in.web.dto.command.SignUpCommand;
import com.bidmall.user.adapter.in.web.dto.response.LoginResponse;
import com.bidmall.user.application.auth.TokenResponse;
import com.bidmall.user.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserApplicationMapper {

  // 로그인
  LoginResponse tokenResponseToLogin(TokenResponse tokenResponse);

  // 회원가입
  User commandToUser(SignUpCommand signUpCommand);
}
