package com.example.commondesign.service.impl;

import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: commonDesign
 * @DESCRIPTION:
 * @AUTHOR: lx
 * @DATE: 2022/3/8 13:27
 */
@Service
public class UserIdGeneratorHandler extends IdGeneratorHandler {

    @Override
    public String businessCode() {
        return "user";
    }

    @Override
    public String getId() {
        return snowflakes();
    }

    /**
     * 通过雪花算法生成id
     *
     * @return
     */
    public String snowflakes() {
        return "xxx...";
    }
}
