package com.bidmall.user.application.port.in;

import com.bidmall.user.adapter.in.web.dto.command.LoginCommand;
import com.bidmall.user.adapter.in.web.dto.response.LoginResponse;
import org.springframework.stereotype.Component;

@Component
public interface UserUseCase {

  LoginResponse login(LoginCommand loginCommand);

}
