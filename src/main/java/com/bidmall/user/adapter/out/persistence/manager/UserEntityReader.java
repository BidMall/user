package com.bidmall.user.adapter.out.persistence.manager;

import com.bidmall.user.adapter.out.persistence.entity.UserEntity;
import com.bidmall.user.adapter.out.persistence.repository.UserJpaRepository;
import com.bidmall.user.exception.InvalidCredentialsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserEntityReader {

  private final UserJpaRepository userJpaRepository;

  public UserEntity findActiveUserByAccountAndPassword(String account, String password) {
    return userJpaRepository.findByAccountAndPasswordAndIsDeleted(account, password, false)
        .orElseThrow(InvalidCredentialsException::new);
  }

}
