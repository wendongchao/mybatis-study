package com.mybatis.db;


import com.mybatis.bean.User;

/**
 * Created by sang on 17-1-13.
 */
public interface UserMapper {
    public User getUser(Long id);

    public int insertUser(User user);

    public int deleteUser(Long id);
}
