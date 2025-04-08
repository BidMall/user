package com.bidmall.user.adapter.out.persistence.adapter;

import com.bidmall.user.adapter.out.persistence.entity.UserEntity;
import com.bidmall.user.adapter.out.persistence.manager.UserEntityCreator;
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
  private final UserEntityCreator userEntityCreator;
  private final UserPersistenceMapper userMapper;

  @Override
  public User findActiveUserByAccountAndPassword(String account, String password) {
    UserEntity entity = userEntityReader.findActiveUserByAccountAndPassword(account, password);
    return userMapper.entityToDomain(entity);
  }

  @Override
  public void save(User user) {
    UserEntity entity = userMapper.domainToEntity(user);
    userEntityCreator.save(entity);
  }

  @Override
  public User findById(Long id) {
    UserEntity entity = userEntityReader.findById(id);
    return userMapper.entityToDomain(entity);
  }
}
