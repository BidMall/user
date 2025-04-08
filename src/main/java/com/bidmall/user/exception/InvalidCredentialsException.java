package com.bidmall.user.exception;

import com.bidmall.user.exception.type.BusinessException;
import lombok.Getter;

@Getter
public class InvalidCredentialsException extends BusinessException {

  private final String code;
  public InvalidCredentialsException() {
    this(ErrorType.INVALID_CREDENTIALS.getMessage());
  }

  public InvalidCredentialsException(final String message) {
    super(message);
    this.code = ErrorType.INVALID_CREDENTIALS.name();
  }
}
