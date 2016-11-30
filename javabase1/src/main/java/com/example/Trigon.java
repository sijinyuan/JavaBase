package com.example;/**
 * Created by Administrator on 2016/11/30.
 */

/**
 * 1.打印出杨辉三角形（要求打印出10行以上）
 * 2.作者：佀晋元 2016/11/30
 */
public class Trigon {
//    思路是创建一个整型二维数组，包含10个一维数组。使用双层循环，在外层循环中初始化每一个第二层数组的大小。
//    在内层循环中，先将两侧的数组元素赋值为1，其他数值通过公式计算，然后输出数组元素。
    public static void main(String[] args) {
        int triangle[][]=new int[10][];// 创建二维数组
        // 遍历二维数组的第一层
        for (int i = 0; i < triangle.length; i++) {
            triangle[i]=new int[i+1];// 初始化第二层数组的大小
            // 遍历第二层数组
            for(int j=0;j<=i;j++){
                // 将两侧的数组元素赋值为1
                if(i==0||j==0||j==i){
                    triangle[i][j]=1;
                }else{// 其他数值通过公式计算
                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
                }
                System.out.print(triangle[i][j]+"\t");         // 输出数组元素
            }
            System.out.println();               //换行
        }

    }


}
