package com.bwie.test;
/**
 * Created by Administrator on 2016/12/2.
 */

import java.util.Random;

/**
 * 1.
 * 2.作者：佀晋元 2016/12/1
 */
public class Ticket implements Runnable{

      public  int total;
      public int count;
      public Ticket(){
          total=10;
          count=0;
      }

    @Override
     public void run() {

          while (total>0){

              synchronized (this){   if(total>1){
                    try {
//                        Thread.sleep(400);
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"\t售出票号： --------> "+count+++"\t当前票数------> "+total--);
            }
        }
    }

    public static void main(String[] args) {
        Ticket   ticket=new Ticket();
        for(int i=1;i<=3;i++){
            new Thread(ticket,"售票点"+i).start();
        }

    }
}
