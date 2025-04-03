package com.bidmall.user.adapter.in.web.mapper;

import com.bidmall.user.adapter.in.web.dto.command.LoginCommand;
import com.bidmall.user.adapter.in.web.dto.request.LoginRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserWebMapper {
  LoginCommand loginToCommand(LoginRequest loginRequest);
}
