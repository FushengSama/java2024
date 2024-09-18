package com.example.springserver.dao.imp;

import com.example.springserver.dao.UserHandle;
import com.example.springserver.mapper.userHandleMapper;
import com.example.springserver.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userHandleImp implements UserHandle {
    @Autowired
    private userHandleMapper userhandleMapper;
    @Override
    public List<User> findAll() {

        return userhandleMapper.findAll();
    }

    @Override
    public List<User> findById(String uuid) {
        return userhandleMapper.findById(uuid);
    }

    @Override
    public List<User> findByName(String name) {
        return userhandleMapper.findByName(name);
    }

    @Override
    public List<User> findByphone(String phone) {
        return userhandleMapper.findByphone(phone);
    }

    @Override
    public int insert(User user) {
        return userhandleMapper.insert(user);
    }

    @Override
    public int update(User user,String uuid) {
        return userhandleMapper.update(user,uuid);
    }

    @Override
    public int delete(String uuid) {
        return userhandleMapper.delete(uuid);
    }


}
