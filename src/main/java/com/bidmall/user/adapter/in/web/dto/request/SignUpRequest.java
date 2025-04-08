package com.bidmall.user.adapter.in.web.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignUpRequest {

  private String account;
  private String password;
  private String name;

}
