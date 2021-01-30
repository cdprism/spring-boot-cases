package org.shancm.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shancm.mybatisplus.dao.UserMapper;
import org.shancm.mybatisplus.domain.entity.User;
import org.shancm.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public List<User> list() {
        return this.list(null);
    }
}
