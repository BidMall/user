package com.bidmall.user.adapter.out.persistence.adapter;

import com.bidmall.user.adapter.out.persistence.entity.UserEntity;
import com.bidmall.user.adapter.out.persistence.manager.UserEntityReader;
import com.bidmall.user.adapter.out.persistence.mapper.UserPersistenceMapper;
import com.bidmall.user.application.port.out.UserRepositoryPort;
import com.bidmall.user.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {

  private final UserEntityReader userEntityReader;
  private final UserPersistenceMapper userMapper;

  @Override
  public User findByAccountAndPassword(String account, String password) {
    UserEntity entity = userEntityReader.findByAccountAndPassword(account, password);
    return userMapper.entityToDomain(entity);
  }
}
