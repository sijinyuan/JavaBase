package com.example;
/**
 * Created by Administrator on 2016/11/30.
 */
/**
 * 1.5λ�����ҳ����У��ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 * 2.���ߣ��˽�Ԫ 2016/11/30
 */
public class Palindrom {
//    static int[] a = new int[5];
//    static int[] b = new int[5];
//    public static void main(String[] args) {
//        boolean is =false;
//        Scanner s = new Scanner(System.in);
//        long l = s.nextLong();
//        if (l > 99999 || l < 10000) {
//            System.out.println("Input error, please input again!");
//            l = s.nextLong();
//        }
//        for (int i = 4; i >= 0; i--) {
//            a[i] = (int) (l / (long) Math.pow(10, i));
//            l =(l % ( long) Math.pow(10, i));
//        }
//        System.out.println();
//        for(int i=0,j=0; i<5; i++, j++) {
//            b[j] = a[i];
//        }
//        for(int i=0,j=4; i<5; i++, j--) {
//            if(a[i] != b[j]) {
//                is = false;
//                break;
//            } else {
//                is = true;
//            }
//        }
//        if(is == false) {
//            System.out.println("is not a Palindrom!");
//        } else if(is == true) {
//            System.out.println("is a Palindrom!");
//        }
//    }
    /**
     * autour: �˽�Ԫ
     * date: 2016/11/30 19:07
     * update: 2016/11/30
     * version: 5λ�����ҳ����У��ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ
     */


        public static void main(String[] args) {
            int j = 0;
            for (long i = 10000; i < 100000; i++)
                if (ishuiwen(i) == 1) {//�������ֵ��1�����ǻ���������ӡ�����������0���Ͳ��ǻ�����,����ӡ
                    j++;
                    System.out.println("������:" + i);
                }
            System.out.println(j + "����ͬ�Ļ�����");

        }
        public static int ishuiwen(long x) {
            int a, b, c, d, e;//5������
            a = (int) (x / 10000);//a=i����10000
            b = (int) ((x / 1000) % 10);//b=i����1000����10ȡ��
            c = (int) ((x / 100) % 10);//c=i����100����10ȡ��
            d = (int) ((x / 10) % 10);//d=i����10����10ȡ��
            e = (int) (x % 10);//e=i��10ȡ��
            if ((a == e) && (b == d))//���a=e����b=d�����ǻ�����������1
                return 1;
            else//���򷵻�0
                return 0;
        }
    }

