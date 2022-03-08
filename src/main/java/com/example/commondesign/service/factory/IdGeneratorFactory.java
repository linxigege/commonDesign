package com.example.commondesign.service.factory;

import com.example.commondesign.service.IdGenerator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @PROJECT_NAME: commonDesign
 * @DESCRIPTION:
 * @AUTHOR: lx
 * @DATE: 2022/3/8 13:27
 */
public class IdGeneratorFactory {

    public static Map<String, IdGenerator> map;

    static {
        map = new ConcurrentHashMap<>(4);
    }
}
