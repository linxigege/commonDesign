package com.example.commondesign.service.impl;

import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @PROJECT_NAME: commonDesign
 * @DESCRIPTION:
 * @AUTHOR: lx
 * @DATE: 2022/3/8 13:26
 */
@Service
public class OrderIdGeneratorHandler extends IdGeneratorHandler {

    private final int maxId = 10000;

    @Override
    public String businessCode() {
        return "order";
    }

    /**
     * 在获取id前我可能有些想法
     */
    @Override
    public void beforeGetId(String code) {
        // 现根据这个code拿下现在id的最大缓存值
        // redis get xxxx
        int id = 9999;
        // 欸，我在生成id前先看看id满了没有，欸就是玩儿
        if (id == maxId) {
            throw new RuntimeException("生成id已达上限");
        }
    }

    /**
     * 获取完id之后我可能还有些想法
     */
    @Override
    public void afterGetId(String id) {
        // 欸，我在生成完id之后先看看有没有重复的，我再插进库
        if (!Objects.isNull(selectOrderById(id))) {
            throw new RuntimeException("id已存在");
        }
    }

    public Object selectOrderById(String id) {
        return id == "" ? id : null;
    }
}
