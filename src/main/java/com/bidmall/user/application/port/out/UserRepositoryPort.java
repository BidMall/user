package com.bidmall.user.application.port.out;

import com.bidmall.user.domain.model.User;

public interface UserRepositoryPort {
  User findByAccountAndPassword(String account, String password);
}
