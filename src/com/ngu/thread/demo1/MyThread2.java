package com.ngu.thread.demo1;

/**
 * @Author: 李良超
 * @Date: Created in 2019/4/25 12:50
 * @Description: 线程对象，用于输出1000次 ###
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        int count = 1000;
        for (int i = 1; i <= count; i++) {
            System.out.println(i + " ###");
        }
    }
}
