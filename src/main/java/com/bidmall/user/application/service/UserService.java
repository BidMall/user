package com.bidmall.user.application.service;

import com.bidmall.user.adapter.in.web.dto.command.LoginCommand;
import com.bidmall.user.adapter.in.web.dto.response.LoginResponse;
import com.bidmall.user.application.auth.TokenManager;
import com.bidmall.user.application.auth.TokenResponse;
import com.bidmall.user.application.mapper.UserApplicationMapper;
import com.bidmall.user.application.port.in.UserUseCase;
import com.bidmall.user.application.port.out.UserRepositoryPort;
import com.bidmall.user.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserUseCase {

  private final UserRepositoryPort userRepositoryPort;
  private final UserApplicationMapper userMapper;
  private final TokenManager tokenManager;

  @Override
  public LoginResponse login(LoginCommand loginCommand) {

    String account = loginCommand.getAccount();
    String password = loginCommand.getPassword();
    User user = userRepositoryPort.findByAccountAndPassword(account, password);

    TokenResponse response = tokenManager.getToken(user);

    return userMapper.tokenResponseToLogin(response);
  }

}
