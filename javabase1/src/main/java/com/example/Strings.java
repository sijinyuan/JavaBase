package com.example;/**
 * Created by Administrator on 2016/11/30.
 */

/**
 * Java中字符串中子串的查找共有四种方法，如下：
 1、int indexOf(String str) ：返回第一次出现的指定子字符串在此字符串中的索引。
 2、int indexOf(String str, int startIndex)：从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。
 3、int lastIndexOf(String str) ：返回在此字符串中最右边出现的指定子字符串的索引。
 4、int lastIndexOf(String str, int startIndex) ：从指定的索引处开始向后搜索，返回在此字符串中最后一次出现的指定子字符串的索引。
 * 1.计算字符串中子串出现的次数
 * 2.作者：佀晋元 2016/11/30
 * 从头开始查找是否存在指定的字符
 *  System.out.println(str1.indexOf("d"));
 * 从第四个字符位置开始往后继续查找
 * System.out.println(str1.indexOf("c", 3));
 * 若指定字符串中没有该字符则系统返回-1
 * System.out.println(str1.indexOf("x"));
 */
public class Strings {
    /**
     * API中String的常用方法
     */
    // 查找指定字符串是否存在
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str = "abcdefabhjlecababcab";
        int count = 0;
        int start = 0;
        while (str.indexOf(str1, start) >= 0 && start < str.length()) {
            count++;
            start = str.indexOf(str1, start) + str1.length();
        }
        System.out.println(str1 + "在" + str + "出现的次数为" + count);
    }
    }


