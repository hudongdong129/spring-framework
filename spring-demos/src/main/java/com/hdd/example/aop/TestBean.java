package com.hdd.example.aop;

/**
 * @author hdd
 * @description:
 * @date 2024年11月28日
 */
public class TestBean {

    private String test = "test";

    public void test(){
        System.out.println("test");
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }


}
