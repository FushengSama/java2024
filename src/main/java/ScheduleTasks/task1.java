package ScheduleTasks;


import org.springframework.boot.autoconfigure.quartz.QuartzDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@EnableScheduling
@EnableAsync
public class task1 {
    @Resource
    private RedisTemplate redisTemplate;



@Async
    @Scheduled(fixedRate = 5000)

    public void task11() throws InterruptedException {
    System.out.println("firstTaskStart :"+ LocalDateTime.now());
    String name=
            (String) redisTemplate.opsForValue().get("name");
    System.out.println(name);
    Thread.sleep(5000);

}

}
