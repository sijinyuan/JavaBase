package com.bwie.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
/**
 * autour: 佀晋元
 * date: 2016/12/2 20:15
 * update: 2016/12/2
 * 这个例子中用到了handler的消息队列机制，即通过handler中一个线程向消息队列中用sendMessage方法发送消息，
 * 发送的消息当然可以用来传递参数。
 * 在handler中用handleMessage来处理消息，处理方法是获得消息队列中的消息参数，用这些参数来完成另外一些功能。
 */

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    private Button start1;
    private ProgressBar progress_bar;
    //创建一个handler，内部完成处理消息方法
    Handler update_progress_bar =new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //显示进度条
            progress_bar.setProgress(msg.arg1);
            //重新把进程加入到进程队列中
            update_progress_bar.post(update_thread);
        }
    };
    private Button tiao3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        start1=(Button)findViewById(R.id.start1);
        start1.setOnClickListener(this);
        progress_bar =(ProgressBar) findViewById(R.id.progress_bar);
        tiao3=(Button)findViewById(R.id.tiao3);
        tiao3.setOnClickListener(this);
    }
    Runnable update_thread=new Runnable() {
        int i = 0;
        @Override
        public void run() {
            //首先获得一个消息结构
            i += 10;
            Message msg=update_progress_bar.obtainMessage();
            //给消息结构的arg1的参数赋值
            msg.arg1=i;
            //延时1s，java中的try+catch用来排错处理
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            update_progress_bar.sendMessage(msg);
            if(i==100){
                //把线程从线程队列中移除
                update_progress_bar.removeCallbacks(update_thread);
            }

        }
    };

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.start1:
                //让进度条显示出来
                progress_bar.setVisibility(View.VISIBLE);
                //将线程加入到handler的线程队列中
                update_progress_bar.post(update_thread);

                break;
            case  R.id.tiao3:
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);

        }
    }
}
