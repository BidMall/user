package com.bidmall.user.adapter.in.web.dto.command;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginCommand {

  private String account;
  private String password;

}
