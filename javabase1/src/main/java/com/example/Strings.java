package com.example;/**
 * Created by Administrator on 2016/11/30.
 */

/**
 * Java���ַ������Ӵ��Ĳ��ҹ������ַ��������£�
 1��int indexOf(String str) �����ص�һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е�������
 2��int indexOf(String str, int startIndex)����ָ������������ʼ�����ص�һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е�������
 3��int lastIndexOf(String str) �������ڴ��ַ��������ұ߳��ֵ�ָ�����ַ�����������
 4��int lastIndexOf(String str, int startIndex) ����ָ������������ʼ��������������ڴ��ַ��������һ�γ��ֵ�ָ�����ַ�����������
 * 1.�����ַ������Ӵ����ֵĴ���
 * 2.���ߣ��˽�Ԫ 2016/11/30
 * ��ͷ��ʼ�����Ƿ����ָ�����ַ�
 *  System.out.println(str1.indexOf("d"));
 * �ӵ��ĸ��ַ�λ�ÿ�ʼ�����������
 * System.out.println(str1.indexOf("c", 3));
 * ��ָ���ַ�����û�и��ַ���ϵͳ����-1
 * System.out.println(str1.indexOf("x"));
 */
public class Strings {
    /**
     * API��String�ĳ��÷���
     */
    // ����ָ���ַ����Ƿ����
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str = "abcdefabhjlecababcab";
        int count = 0;
        int start = 0;
        while (str.indexOf(str1, start) >= 0 && start < str.length()) {
            count++;
            start = str.indexOf(str1, start) + str1.length();
        }
        System.out.println(str1 + "��" + str + "���ֵĴ���Ϊ" + count);
    }
    }


