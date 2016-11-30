package com.example;/**
 * Created by Administrator on 2016/11/30.
 */

import java.util.Scanner;

/**
 * 1.
 * 多少项阶乘的和
 * 求1+2!+3!+...+20!的和
 * 2.作者：佀晋元 2016/11/30
 */
public class NumCount {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("请输入多少项阶乘的和:");
        Scanner in = new Scanner(System.in);//控制台输入
        int n = in.nextInt();
        int an = 0;

        for(int i = 1;i <= n + 1;i++){
            if(i == n + 1){
                sum += an;
            }else if(i == n){
                sum += an;
                an = 1;
                System.out.print(i+"!");
                for(int j = i;j >= 1;j--){
                    an *=j;
                }
            }else if(i%10 == 0){
                System.out.println();
                sum += an;
                an = 1;
                System.out.print(i+"!"+"+");
                for(int j = i;j >= 1;j--){
                    an *=j;
                }
            }else{
                sum = sum + an;
                an = 1;
                System.out.print(i+"!"+"+");
                for(int j = i;j >= 1;j--){
                    an *=j;
                }
            }
        }System.out.println(" = "+sum);

    }

}
