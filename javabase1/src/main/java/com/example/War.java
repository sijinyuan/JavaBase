package com.example;/**
 * Created by Administrator on 2016/12/1.
 */

/**
 * 1.
 * 2.作者：佀晋元 2016/12/1
 */
public class War {

    public static void main(String[] args) {
        Monkey m1=new Monkey("第1个小悟空");  //创建第1个小悟空对象
        Monkey m2=new Monkey("第2个小悟空");  //创建第2个小悟空对象
        Monkey m3=new Monkey("第3个小悟空");  //创建第3个小悟空对象

        Thread t1=new Thread(m1);  //创建第1个小悟空线程对象
        Thread t2=new Thread(m2);  //创建第2个小悟空线程对象
        Thread t3=new Thread(m3);  //创建第3个小悟空线程对象

        t1.start();  //启动第1个小悟空线程
        t2.start();  //启动第2个小悟空线程
        t3.start();  //启动第3个小悟空线程
    }


}
