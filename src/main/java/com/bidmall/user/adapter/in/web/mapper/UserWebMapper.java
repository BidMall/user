package com.bidmall.user.adapter.in.web.mapper;

import com.bidmall.user.adapter.in.web.dto.command.LoginCommand;
import com.bidmall.user.adapter.in.web.dto.command.SignUpCommand;
import com.bidmall.user.adapter.in.web.dto.request.LoginRequest;
import com.bidmall.user.adapter.in.web.dto.request.SignUpRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserWebMapper {

  // 로그인
  LoginCommand loginToCommand(LoginRequest loginRequest);

  // 회원가입
  SignUpCommand signUpToCommand(SignUpRequest signUpRequest);
}
