package com.jk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dell on 2017/5/26.
 */
@Service
public class DemoService {

    @Autowired
    public DemoMapper demoMapper;

    public List<Demo> likeName(String name){
        List<Demo> list = demoMapper.likeName(name);
        return list;
    }

    @Transactional
    public void save(Demo demo){
        demoMapper.save(demo);
    }
}
