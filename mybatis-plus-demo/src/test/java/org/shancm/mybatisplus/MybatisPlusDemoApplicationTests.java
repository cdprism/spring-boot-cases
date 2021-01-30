package org.shancm.mybatisplus;

import org.junit.jupiter.api.Test;
import org.shancm.mybatisplus.dao.UserMapper;
import org.shancm.mybatisplus.domain.entity.User;
import org.shancm.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserService userService;
//    @Autowired
//    private UserMapper userMapper;

    @Test
    public void list() {
        List<User> userList = userService.list();

//        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
