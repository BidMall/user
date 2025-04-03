package com.bidmall.user.adapter.out.persistence.mapper;

import com.bidmall.user.adapter.out.persistence.entity.UserEntity;
import com.bidmall.user.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserPersistenceMapper {
  User entityToDomain(UserEntity userEntity);
}
