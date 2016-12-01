package com.example;/**
 * Created by Administrator on 2016/12/1.
 */

/**
 * 1.
 * 2.作者：佀晋元 2016/12/1
 */
public class VideoThread extends Thread{
        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
            for(int i =0;i<10;i++){
                System.out.println(this.getName()+" i = "+i);
                try{
                    Thread.sleep(100);//不能使用抛出异常，只能使用捕获处理，
                    //Thread类的run()方法没有抛出异常类型，所以子类不能使用抛出异常类型。
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
}
