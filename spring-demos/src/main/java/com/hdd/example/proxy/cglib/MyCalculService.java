package com.hdd.example.proxy.cglib;


/**
 * @author hdd
 * @description: 计算
 * @date 2024年05月20日
 */
public class MyCalculService{

    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    public Integer mul(Integer a, Integer b) {
        return a * b;
    }
}
