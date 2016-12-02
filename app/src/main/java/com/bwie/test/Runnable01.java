package com.bwie.test;/**
 * Created by Administrator on 2016/12/2.
 */

/**
 * 1.
 * 2.作者：佀晋元 2016/12/1
 */
public class Runnable01 implements Runnable {


    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("乌龟领先，加油!"+(i+1));
        }
    }

    public static void main(String[] args) {
        Runnable01 r = new Runnable01();
        Thread t = new Thread(r);
        //t.setPriority(Thread.MAX_PRIORITY);
        try {
            //让乌龟睡3s
            t.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.start();
        for (int i = 0; i < 5; i++) {
            try {
                //让兔子睡3s
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("兔子领先，别骄傲!" + (i + 1));
        }
    }
}
