package com.jk.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by dell on 2017/5/26.
 */
@Configuration
public class MybatisConfig {

    @Bean
    public PageHelper pageHelper(){
        System.out.println("MyBatisConfiguration.pagehelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum","true");
        p.setProperty("rowBoundsWithCount","true");
        p.setProperty("reasonable","true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
