package com.example.commondesign;

import com.example.commondesign.service.factory.IdGeneratorFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
class CommonDesignApplicationTests {

    @Resource
    private IdGeneratorFactory idGeneratorFactory;

    @Test
    void contextLoads() {
        System.out.println(idGeneratorFactory.getId("user"));
        System.out.println(idGeneratorFactory.getId("order"));
        System.out.println(idGeneratorFactory.getId("log"));
        System.out.println(idGeneratorFactory.getId("999"));
    }

}
