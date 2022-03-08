package com.example.commondesign.service.impl;

import com.example.commondesign.service.IdGenerator;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @PROJECT_NAME: commonDesign
 * @DESCRIPTION:
 * @AUTHOR: lx
 * @DATE: 2022/3/8 13:14
 */
abstract class IdGeneratorHandler implements IdGenerator {

    /**
     * 业务码
     *
     * @return
     */
    @Override
    public abstract String businessCode();

    /**
     * 获取业务id
     *
     * @return
     */
    @Override
    public String getId() {
        // return UUid
        beforeGetId(businessCode());
        String returnId = UUID.randomUUID().toString().replace("-", "");
        afterGetId(returnId);
        return returnId;
    }

    /**
     * 在获取id前我可能有些想法
     */
    protected void beforeGetId(String code) {

    }

    /**
     * 获取完id之后我可能还有些想法
     */
    protected void afterGetId(String returnId) {

    }
}
