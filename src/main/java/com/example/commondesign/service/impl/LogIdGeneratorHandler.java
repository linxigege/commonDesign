package com.example.commondesign.service.impl;

import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: commonDesign
 * @DESCRIPTION:
 * @AUTHOR: lx
 * @DATE: 2022/3/8 13:26
 */
@Service
public class LogIdGeneratorHandler extends IdGeneratorHandler {
    @Override
    public String businessCode() {
        return "log";
    }

    @Override
    public String getId() {
        // redis set id:logService:xxx 1
        // redis incr id:logService:xxx
        // redis get id:logService:xxx
        return String.valueOf(1);
    }
}
