package com.bidmall.user.exception;

import lombok.Getter;

@Getter
public enum ErrorType {
  INVALID_CREDENTIALS("ID 혹은 PW가 잘못되었습니다."),
  NOT_FOUND_USER("존재하지 않거나 접근 권한이 없는 회원입니다.");

  private final String message;

  ErrorType(String message) {
    this.message = message;
  }
}
