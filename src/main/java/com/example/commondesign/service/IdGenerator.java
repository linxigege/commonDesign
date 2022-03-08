package com.example.commondesign.service;

/**
 * @PROJECT_NAME: commonDesign
 * @DESCRIPTION:
 * @AUTHOR: lx
 * @DATE: 2022/3/8 13:11
 */
public interface IdGenerator {

    /**
     * 业务码
     *
     * @return
     */
    String businessCode();

    /**
     * 获取业务id
     *
     * @return
     */
    String getId();

    /**
     * 获取编号
     *
     * @return
     */
    String getNumber();
}
