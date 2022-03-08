package com.example.commondesign.service.impl;

import com.example.commondesign.service.IdGenerator;

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
    public String businessCode() {
        return "default";
    }

    /**
     * 获取业务id
     *
     * @return
     */
    @Override
    public String getId() {
        // return UUid
        beforeGetId();
        String returnId = UUID.randomUUID().toString().replace("-", "");
        afterGetId();
        return returnId;
    }

    /**
     * 在获取id前我可能有些想法
     */
    public void beforeGetId() {

    }

    /**
     * 获取完id之后我可能还有些想法
     */
    public void afterGetId() {

    }

    /**
     * 获取编号
     *
     * @return
     */
    @Override
    public String getNumber() {
        // return default:00000001 [一段编号]
        return new StringBuilder(businessCode()).append(":").append("00000001").toString();
    }
}
