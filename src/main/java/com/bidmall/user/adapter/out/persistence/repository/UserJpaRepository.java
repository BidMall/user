package com.bidmall.user.adapter.out.persistence.repository;

import com.bidmall.user.adapter.out.persistence.entity.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {

  Optional<UserEntity> findByAccountAndPassword(String account, String password);
}
