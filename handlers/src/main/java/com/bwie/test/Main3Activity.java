package com.bwie.test;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    private MyView myView;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //创建一个handler
        mHandler=new Handler();
        myView=new MyView(this);
        //调用handler.post(Runnable r)方法
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                //直接调用View.invalidate,更新组件
                myView.invalidate();
                //延迟5毫秒后执行线程
                mHandler.postDelayed(this,5);


            }
        });
        setContentView(myView);


    }
}
