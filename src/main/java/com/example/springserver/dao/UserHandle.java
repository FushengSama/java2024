package com.example.springserver.dao;

import com.example.springserver.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserHandle {
    List<User> findAll();
    List<User> findById( String uuid);
    List<User> findByName(String name);
    List<User> findByphone( String phone);
    int insert( User user);
    int update(User user,String uuid);
    int delete(String uuid);
}
