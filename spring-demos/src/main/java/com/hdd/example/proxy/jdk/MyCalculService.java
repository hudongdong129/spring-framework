package com.hdd.example.proxy.jdk;

/**
 * @author hdd
 * @description: 计算
 * @date 2024年05月20日
 */
public class MyCalculService implements MyCalculServiceIface{
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer mul(Integer a, Integer b) {
        return a * b;
    }
}
