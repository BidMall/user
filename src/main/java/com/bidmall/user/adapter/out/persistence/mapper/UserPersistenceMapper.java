package com.bidmall.user.adapter.out.persistence.mapper;

import com.bidmall.user.adapter.out.persistence.entity.UserEntity;
import com.bidmall.user.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserPersistenceMapper {

  // 로그인
  User entityToDomain(UserEntity userEntity);

  // 회원가입
  UserEntity domainToEntity(User user);
}
