package com.bidmall.user.adapter.out.persistence.manager;

import com.bidmall.user.adapter.out.persistence.entity.UserEntity;
import com.bidmall.user.adapter.out.persistence.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserEntityCreator {

  private final UserJpaRepository userJpaRepository;

  public UserEntity save(UserEntity userEntity) {
    return userJpaRepository.save(userEntity);
  }
}
