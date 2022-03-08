package com.example.commondesign.service.impl;

import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: commonDesign
 * @DESCRIPTION:
 * @AUTHOR: lx
 * @DATE: 2022/3/8 19:36
 */
@Service
public class DefaultIdGeneratorHandler extends IdGeneratorHandler {
    @Override
    public String businessCode() {
        return "default";
    }
}
