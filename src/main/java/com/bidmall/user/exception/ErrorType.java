package com.bidmall.user.exception;

import lombok.Getter;

@Getter
public enum ErrorType {
  INVALID_CREDENTIALS("ID 혹은 PW가 잘못되었습니다.");

  private final String message;

  ErrorType(String message) {
    this.message = message;
  }
}
