package com.bidmall.user.adapter.in.web.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginResponse {

  private String accessToken;
  private String refreshToken;

}
