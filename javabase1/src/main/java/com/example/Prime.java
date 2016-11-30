package com.example;/**
 * Created by Administrator on 2016/11/30.
 */

/**
 * 1.
 * 2.作者：佀晋元 2016/11/30
 */
public class Prime {

        public static void main(String[] args) {
            int i,n,k=0;
            for (n = 3; n <= 100; n++) {
                i=2;
                while (i<n){
                    if (n%i==0)break;//若能整除说明n不是素数，跳出当前循环
                    i++;
                }
                if (i == n){//如果i==n则说明n不能被2~n-1整除，是素数
                    k++; //统计输出的个数
                    System.out.print(i+"\t");
                    if (k%6 == 0){//没输出5个则换行
                        System.out.println();
                    }
                }
            }
        }


}
