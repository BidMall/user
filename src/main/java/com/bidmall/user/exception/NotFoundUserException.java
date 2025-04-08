package com.bidmall.user.exception;

import com.bidmall.user.exception.type.BusinessException;

import lombok.Getter;

@Getter
public class NotFoundUserException extends BusinessException {

  private final String code;
  public NotFoundUserException() {
    this(ErrorType.INVALID_CREDENTIALS.getMessage());
  }

  public NotFoundUserException(final String message) {
    super(message);
    this.code = ErrorType.INVALID_CREDENTIALS.name();
  }
}
