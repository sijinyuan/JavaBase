package com.example;/**
 * Created by Administrator on 2016/11/30.
 */

import java.util.Scanner;

/**
 * 1.古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？
 * 2.作者：佀晋元 2016/11/30
 */
public class Rabbit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入要计算的月数:");
        int m=input.nextInt();
        int i=1;
        int[] arr=new int[m+1];
        for(i=1;i<m+1;i++)
        {
            if(i==1|i==2)
                arr[1]=arr[2]=1;
            else
                arr[i]=arr[i-2]+arr[i-1];
        }
        for(i=1; i<m+1;i++)
        {
            System.out.println("第" + i +"月的兔子数目为:" + arr[i]);
        }
    }

}
