package com.bidmall.user.exception.type;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

  private final String code;

  public BusinessException(final String message) {
    super(message);
    this.code = ApiErrorType.BAD_REQUEST.name();
  }
}
