package com.xiao.shardingjdbc02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiao
 */
@SpringBootApplication
@MapperScan("com.xiao.shardingjdbc02.mapper")
public class ShardingJdbc02Application {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbc02Application.class, args);
    }

}
