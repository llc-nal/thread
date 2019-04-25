package com.ngu.thread;

import com.ngu.thread.demo1.MyThread1;
import com.ngu.thread.demo1.MyThread2;

/**
 * @Author: 李良超
 * @Date: 2019/4/25 13:11
 * @Description: 测试主类
 */
public class Main {

    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        t1.start();
        t2.start();
        System.out.println("Hello World!");
    }
}
