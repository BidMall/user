package com.bidmall.user.application.mapper;

import com.bidmall.user.adapter.in.web.dto.response.LoginResponse;
import com.bidmall.user.application.auth.TokenResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserApplicationMapper {

  LoginResponse tokenResponseToLogin(TokenResponse tokenResponse);

}
