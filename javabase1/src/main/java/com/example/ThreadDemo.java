package com.example;
/**
 * Created by Administrator on 2016/12/1.
 */

/**
 * 1.
 * 2.���ߣ��˽�Ԫ 2016/12/1
 */
/*
          �߳���������״̬ͼ���̳߳��õķ�����
          �̵߳��������ڣ�����״̬���ȴ�����̬������״̬������״̬������״̬��
          ����״̬��ִ������ʱ�跽��sleep()��wait()������sleepһ������sleepʱ��״̬�ͻ�ת����
          ����״̬������wait()�����ȴ�ʱ�����Ҫ�������̻߳��ѡ�
          �̳߳���������String getName()   �����߳�����
          Thread(Runnable target, String name)
          void setName(String name)
          static void sleep(long millis); ��̬����
          int getPriority() �����̵߳����ȼ���//�߳����ȼ�Ĭ��ֵԽ�����ȼ�Խ�ã�
          ���ȼ���Χ1~10.
          void setPriority(int newPriority)   �����̵߳����ȼ���
*/
public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        TalkThread t = new TalkThread();
        t.setName("talk thread");
        VideoThread v = new VideoThread();
        v.setName("video thread");
        v.start();
        t.start();
    }





}
