package com.bidmall.user.application.port.out;

import com.bidmall.user.domain.model.User;

public interface UserRepositoryPort {
  User findActiveUserByAccountAndPassword(String account, String password);
  void save(User user);
  User findById(Long id);
}
