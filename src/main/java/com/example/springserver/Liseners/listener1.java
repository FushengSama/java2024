package com.example.springserver.Liseners;

import com.example.springserver.dao.imp.userHandleImp;
import com.example.springserver.po.User;
import com.example.springserver.service.userService;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.Serializable;
import java.util.List;


public class listener1 implements ServletContextListener{
    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private userHandleImp userHandleImp;
    private static final String ALL_USER = "ALL_USER_LIST";
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        List<User> users = userHandleImp.findAll();
        redisTemplate.delete(ALL_USER);
        redisTemplate.opsForList().leftPushAll(ALL_USER, users);
        List<User> queryUserList =redisTemplate.opsForList().range(ALL_USER, 0, -1);
        System.out.println(queryUserList.size());

    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println(redisTemplate.opsForList().size(ALL_USER));
    }

}
