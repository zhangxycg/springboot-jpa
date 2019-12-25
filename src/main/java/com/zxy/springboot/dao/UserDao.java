package com.zxy.springboot.dao;

import com.zxy.springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 继承 JpaRepository 完成对数据库的操作
 * @Author: zhangxy
 * @Date: Created in 2019/12/25
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
