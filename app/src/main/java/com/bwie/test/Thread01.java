package com.bwie.test;/**
 * Created by Administrator on 2016/12/2.
 */
/**
 * autour: 佀晋元
 * date: 2016/12/2 13:37
 * update: 2016/12/2
 * version:
 */

public class Thread01 extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("乌龟领先，加油");
        }
    }

    public static void main(String[] args) {
        Thread01 t=new Thread01();//设置乌龟优先级最高

        t.setPriority(MIN_PRIORITY);
        try {
            //让兔子睡3s
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<100;i++){
            System.out.println("兔子领先，别骄傲");
            //设置兔子的优先级最高
            Thread.currentThread().setPriority(MAX_PRIORITY);
        }
        t.start();
    }





}
