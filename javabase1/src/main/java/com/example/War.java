package com.example;/**
 * Created by Administrator on 2016/12/1.
 */

/**
 * 1.
 * 2.���ߣ��˽�Ԫ 2016/12/1
 */
public class War {

    public static void main(String[] args) {
        Monkey m1=new Monkey("��1��С���");  //������1��С��ն���
        Monkey m2=new Monkey("��2��С���");  //������2��С��ն���
        Monkey m3=new Monkey("��3��С���");  //������3��С��ն���

        Thread t1=new Thread(m1);  //������1��С����̶߳���
        Thread t2=new Thread(m2);  //������2��С����̶߳���
        Thread t3=new Thread(m3);  //������3��С����̶߳���

        t1.start();  //������1��С����߳�
        t2.start();  //������2��С����߳�
        t3.start();  //������3��С����߳�
    }


}
