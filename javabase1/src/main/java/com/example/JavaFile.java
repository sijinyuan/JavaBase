package com.example;/**
 * Created by Administrator on 2016/11/30.
 */

/**
 * 1.
 * 2.���ߣ��˽�Ԫ 2016/11/30
 */
/**
 * Created by Administrator on 2016/11/30/030.
 */

import java.io.File;
import java.util.ArrayList;

/**
 *����:������һ���ļ����µ������ļ�����չʾ���㼶��ϵ���ļ���������ʾ�������һ����ʽд���ı���
 * autour: �˽�Ԫ
 * date: 2016/11/30/030 14:39
 * update: 2016/11/30/030
 */

public class JavaFile
{
    private static ArrayList<String> filelist = new ArrayList<String>();

    public static void main(String[] args) throws Exception {

        String filePath = "E://git";
        getFiles(filePath);
    }
    /*
     * ͨ���ݹ�õ�ĳһ·�������е�Ŀ¼�����ļ�
     */
    static void getFiles(String filePath){
        File root = new File(filePath);
        File[] files = root.listFiles();
        for(File file:files){
            if(file.isDirectory()){
      /*
       * �ݹ����
       */
                getFiles(file.getAbsolutePath());
                filelist.add(file.getAbsolutePath());
                System.out.println("��ʾ"+filePath+"��������Ŀ¼�����ļ�"+file.getAbsolutePath());
            }else{
                System.out.println("��ʾ"+filePath+"��������Ŀ¼"+file.getAbsolutePath());
            }
        }
    }

}
