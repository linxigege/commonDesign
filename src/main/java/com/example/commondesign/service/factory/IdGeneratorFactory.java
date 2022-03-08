package com.example.commondesign.service.factory;

import com.example.commondesign.service.IdGenerator;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @PROJECT_NAME: commonDesign
 * @DESCRIPTION:
 * @AUTHOR: lx
 * @DATE: 2022/3/8 13:27
 */
@Service
public class IdGeneratorFactory implements InitializingBean {

    private Map<String, IdGenerator> map = Collections.emptyMap();

    @Resource
    private ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        // 记得别导错包
        map = applicationContext.getBeansOfType(IdGenerator.class).values().
                stream().collect(Collectors.toMap(IdGenerator::businessCode, handler -> handler));
    }

    public String getId(String code) {
        return map.getOrDefault(code, map.get("default")).getId();
    }
}
