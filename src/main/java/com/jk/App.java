package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.jk")//扫描；该包下相应的class主要是mybatis的持久化类
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
