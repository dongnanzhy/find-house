package com.yanzhao.housefindproject.entity;

import com.yanzhao.housefindproject.HousefindProjectApplicationTests;
import com.yanzhao.housefindproject.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserRepositoryTest extends HousefindProjectApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne() {
        Optional<User> user = userRepository.findById(1L);
        Assert.assertEquals("waliwali", user.get().getName());
    }
}
