package com.example;

public class Mycontent {

//    输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
    public static void main(String[] args) {
        int abcCount=0;//英文字母个数
        int spaceCount=0;//空格键个数
        int numCount=0;//数字个数
        int otherCount=0;//其他字符个数
        java.util.Scanner scan=new java.util.Scanner(System.in);
        String str=scan.nextLine();
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
//判断是否字母
                abcCount++;
            }
            else if(Character.isDigit(ch[i])){
//判断是否数字
                numCount++;
            }
            else if(Character.isSpaceChar(ch[i])){
//判断是否空格键
                spaceCount++;
            }
            else{
//以上都不是则认为是其他字符
                otherCount++;
            }
        }
        System.out.println("字母个数："+abcCount);
        System.out.println("数字个数："+numCount);
        System.out.println("空格个数："+spaceCount);
        System.out.println("其他字符个数："+otherCount);

    }

}
