package com.example.springserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Component
@EnableScheduling
@EnableAsync

@SpringBootTest
class SpringServerApplicationTests {
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void testRedisTemplate() {
        redisTemplate.opsForValue().set("ALL_USER_LIST", "daxz3536da");
        String name=(String)redisTemplate.opsForValue().get("ALL_USER_LIST");
        System.out.println(name);
        redisTemplate.delete("name");
        redisTemplate.opsForValue().set("name", "dxzsa");
        name=(String)redisTemplate.opsForValue().get("name");
        System.out.println(name);

    }

    @Test
    void contextLoads() {
    }







        @Test
        @Async
        @Scheduled(fixedRate = 5000)
        public void first()throws InterruptedException {
            System.out.println("firstTaskStart :"+ LocalDateTime.now());
            String name1=
                    (String) redisTemplate.opsForValue().get("name");
            System.out.println(name1);
            Thread.sleep(5000);

        }

    }


