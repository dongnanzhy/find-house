package com.yanzhao.housefindproject.repository;

import com.yanzhao.housefindproject.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
