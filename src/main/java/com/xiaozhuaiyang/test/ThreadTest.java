package com.xiaozhuaiyang.test;

import java.util.concurrent.atomic.AtomicBoolean;

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
    }
}
