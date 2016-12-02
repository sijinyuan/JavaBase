package com.bwie.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * autour: 佀晋元
 * date: 2016/12/2 19:13
 * update: 2016/12/2
 * handler的机制和原理
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //使用handler时首先要创建一个handler
    Handler handler=new Handler();
    //要用handler来处理多线程可以使用runnable接口，这里先定义该接口
    //线程中运行该接口的run函数
    Runnable updata_thread=new Runnable() {
        @Override
        public void run() {
             //线程每次执行时输出"UpdateThread..."文字,且自动换行
            //textview的append功能和Qt中的append类似，不会覆盖前面
            //的内容，只是Qt中的append默认是自动换行模式
            text_view.append("\nUpdateThread...");
            //延时1s后又将线程加入到线程队列中
            handler.postDelayed(updata_thread, 1000);
        }
    };
    private TextView text_view;
    private Button start;
    private Button end;
    private Button jump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_view = (TextView)findViewById(R.id.text_view);
        start = (Button)findViewById(R.id.start);
        jump=(Button)findViewById(R.id.tiaozhuan);
        end = (Button)findViewById(R.id.end1);
        start.setOnClickListener(this);
        end.setOnClickListener(this);
        jump.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.start:
                    //将线程接口立刻送到队列中
                handler.post(updata_thread);
                break;
            case R.id.end1:
                //  将接口从线程中移除
                 handler.removeCallbacks(updata_thread) ;
                break;
            case R.id.tiaozhuan:
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

                break;

        }
    }
}
