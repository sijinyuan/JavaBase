package com.example;
/**
 * Created by Administrator on 2016/12/1.
 */

/**
 * 1.
 * 2.作者：佀晋元 2016/12/1
 */
/*
          线程生命周期状态图、线程常用的方法。
          线程的生命周期：创建状态、等待就绪态、运行状态、阻塞状态、死亡状态。
          阻塞状态：执行了临时阻方法sleep()和wait()方法，sleep一旦超过sleep时间状态就会转换到
          就绪状态，但是wait()超过等待时间就需要其他的线程唤醒。
          线程常见方法：String getName()   返回线程名。
          Thread(Runnable target, String name)
          void setName(String name)
          static void sleep(long millis); 静态方法
          int getPriority() 返回线程的优先级。//线程优先级默认值越大优先级越好，
          优先级范围1~10.
          void setPriority(int newPriority)   更改线程的优先级。
*/
public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        TalkThread t = new TalkThread();
        t.setName("talk thread");
        VideoThread v = new VideoThread();
        v.setName("video thread");
        v.start();
        t.start();
    }





}
