package com.bidmall.user.application.auth;

import com.bidmall.user.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class TokenManager {

  // note. 임시 코드 / 이후 삭제 및 변경 예정
  public TokenResponse getToken(User user) {
    return TokenResponse.builder()
        .accessToken(user.getName())
        .refreshToken(user.getName())
        .build();
  }
}
