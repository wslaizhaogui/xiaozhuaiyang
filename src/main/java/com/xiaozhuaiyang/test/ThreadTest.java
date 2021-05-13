package com.xiaozhuaiyang.test;

/**
 * @Author: zglai
 * Date:0:20 2021/5/10
 * @Description:<描述>
 */
public class ThreadTest extends Thread {
    @Override
    public void run(){
        System.out.println("run");
    }

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start();
    }
}
