package com.example.springserver.mapper;

import com.example.springserver.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface userHandleMapper {
    List<User> findAll();
    List<User> findById( String uuid);
    List<User> findByName( String name);
    List<User> findByphone( String phone);
    int insert( User user);
    int update(User user , String userUuid);
    int delete(String uuid);
}
