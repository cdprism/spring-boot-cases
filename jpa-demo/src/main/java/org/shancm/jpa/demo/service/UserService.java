package org.shancm.jpa.demo.service;

import org.shancm.jpa.demo.dao.UserDao;
import org.shancm.jpa.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shancm
 * @package org.shancm.spring.jpa.service
 * @description:
 * @date 2019/1/14
 */
@Service
public class UserService {

	private final UserDao userDao;

	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public void save(){
		User user = new User();
		user.setUserName("miss.li");
		User save = userDao.save(user);
		System.out.println(save);
	}
}
