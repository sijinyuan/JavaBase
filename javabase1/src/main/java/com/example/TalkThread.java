package com.example;/**
 * Created by Administrator on 2016/12/1.
 */

/**
 * 1.
 * 2.作者：佀晋元 2016/12/1
 */
public class TalkThread extends Thread {
        @Override
        public void run() {

            // TODO Auto-generated method stub
            super.run();
            for(int i =0;i<10;i++){
                System.out.println(this.getName()+" i = "+i);
            }
        }

}
