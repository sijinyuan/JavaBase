package com.example;/**
 * Created by Administrator on 2016/11/30.
 */

/**
 * 1.��ӡ����������Σ�Ҫ���ӡ��10�����ϣ�
 * 2.���ߣ��˽�Ԫ 2016/11/30
 */
public class Trigon {
//    ˼·�Ǵ���һ�����Ͷ�ά���飬����10��һά���顣ʹ��˫��ѭ���������ѭ���г�ʼ��ÿһ���ڶ�������Ĵ�С��
//    ���ڲ�ѭ���У��Ƚ����������Ԫ�ظ�ֵΪ1��������ֵͨ����ʽ���㣬Ȼ���������Ԫ�ء�
    public static void main(String[] args) {
        int triangle[][]=new int[10][];// ������ά����
        // ������ά����ĵ�һ��
        for (int i = 0; i < triangle.length; i++) {
            triangle[i]=new int[i+1];// ��ʼ���ڶ�������Ĵ�С
            // �����ڶ�������
            for(int j=0;j<=i;j++){
                // �����������Ԫ�ظ�ֵΪ1
                if(i==0||j==0||j==i){
                    triangle[i][j]=1;
                }else{// ������ֵͨ����ʽ����
                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
                }
                System.out.print(triangle[i][j]+"\t");         // �������Ԫ��
            }
            System.out.println();               //����
        }

    }


}
