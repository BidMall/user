package com.bidmall.user.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {

  private Long id;

  private String account;

  private String password;

  private String name;

}
