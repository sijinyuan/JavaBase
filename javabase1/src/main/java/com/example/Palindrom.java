package com.example;
/**
 * Created by Administrator on 2016/11/30.
 */
/**
 * 1.5位数中找出所有，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 * 2.作者：佀晋元 2016/11/30
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
     * autour: 佀晋元
     * date: 2016/11/30 19:07
     * update: 2016/11/30
     * version: 5位数中找出所有，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
     */


        public static void main(String[] args) {
            int j = 0;
            for (long i = 10000; i < 100000; i++)
                if (ishuiwen(i) == 1) {//如果返回值是1，就是回文数，打印出来，如果是0，就不是回文数,不打印
                    j++;
                    System.out.println("回文数:" + i);
                }
            System.out.println(j + "个相同的回文数");

        }
        public static int ishuiwen(long x) {
            int a, b, c, d, e;//5个变量
            a = (int) (x / 10000);//a=i除以10000
            b = (int) ((x / 1000) % 10);//b=i除以1000后向10取余
            c = (int) ((x / 100) % 10);//c=i除以100后向10取余
            d = (int) ((x / 10) % 10);//d=i除以10后向10取余
            e = (int) (x % 10);//e=i想10取余
            if ((a == e) && (b == d))//如果a=e并且b=d，就是回文数，返回1
                return 1;
            else//否则返回0
                return 0;
        }
    }

