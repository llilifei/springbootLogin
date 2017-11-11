package com.longshare.login_demo.dao;

import com.longshare.login_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    //新增用户
    boolean add(User user);
    //查询用户是否存在
    User selectOneUser(String username);
}
