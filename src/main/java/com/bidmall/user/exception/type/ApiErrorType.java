package com.bidmall.user.exception.type;

import lombok.Getter;

@Getter
public enum ApiErrorType {

  BAD_REQUEST("잘못된 요청입니다.");

  private final String message;

  ApiErrorType(String message) {
    this.message = message;
  }
}
