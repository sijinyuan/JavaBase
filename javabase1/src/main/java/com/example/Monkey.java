package com.example;/**
 * Created by Administrator on 2016/12/1.
 */

/**
 * 1.
 * 2.作者：佀晋元 2016/12/1
 */
public class Monkey implements Runnable {
    private String name;

    public Monkey(String name){
        this.name=name;
    }

    public void fight(){ /* 与敌人战斗 */
        for(int i=1;i<=100;i++)
            System.out.println(name+":打败第"+i+"个敌人");
    }

    @Override
    public void run() {
        fight();

    }
}
