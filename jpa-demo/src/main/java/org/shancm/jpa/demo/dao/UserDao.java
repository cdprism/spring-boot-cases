package org.shancm.jpa.demo.dao;

import org.shancm.jpa.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shancm
 * @package org.shancm.spring.jpa.dao
 * @description:
 * @date 2019/1/14
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
