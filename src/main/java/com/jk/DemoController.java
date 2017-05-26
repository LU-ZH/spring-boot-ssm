package com.jk;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dell on 2017/5/26.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("likeName")
    public List<Demo> likeName(String name){
        /**
         * 第一个参数：第几页
         * 第二个参数：一页几条
         */
        PageHelper.startPage(1,3);
        return demoService.likeName(name);
    }

    @RequestMapping("save")
    public Demo save(Demo demo){
        demoService.save(demo);
        return demo;
    }
}
