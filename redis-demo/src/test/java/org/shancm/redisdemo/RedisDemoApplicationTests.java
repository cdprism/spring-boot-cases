package org.shancm.redisdemo;

import org.junit.jupiter.api.Test;
import org.shancm.redisdemo.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;

@SpringBootTest
class RedisDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private RedisTemplate<String, Serializable> templateSerializable;
    @Autowired
    private RedisTemplate<String, String> templateString;

    @Test
    void redisTest(){
        User user = new User();

        templateString.opsForValue().set(user.getName(),user.getAge());

        System.out.println(templateString.opsForValue().get(user.getName()));
        templateSerializable.opsForValue().set("user", user);

        System.out.println(templateSerializable.opsForValue().get("user"));
    }
}
