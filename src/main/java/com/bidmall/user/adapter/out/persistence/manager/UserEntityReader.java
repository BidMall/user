package com.bidmall.user.adapter.out.persistence.manager;

import com.bidmall.user.adapter.out.persistence.entity.UserEntity;
import com.bidmall.user.adapter.out.persistence.repository.UserJpaRepository;
import com.bidmall.user.exception.InvalidCredentialsException;
import com.bidmall.user.exception.NotFoundUserException;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserEntityReader {

  private final UserJpaRepository userJpaRepository;

  public UserEntity findActiveUserByAccountAndPassword(String account, String password) {
    return userJpaRepository.findByAccountAndPasswordAndDeleted(account, password, false)
        .orElseThrow(InvalidCredentialsException::new);
  }

  public UserEntity findById(Long id) {
    return userJpaRepository.findById(id).orElseThrow(NotFoundUserException::new);
  }
}
