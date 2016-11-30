package com.example;/**
 * Created by Administrator on 2016/11/30.
 */

/**
 * 1.
 * 2.作者：佀晋元 2016/11/30
 */
/**
 * Created by Administrator on 2016/11/30/030.
 */

import java.io.File;
import java.util.ArrayList;

/**
 *功能:遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中
 * autour: 佀晋元
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
     * 通过递归得到某一路径下所有的目录及其文件
     */
    static void getFiles(String filePath){
        File root = new File(filePath);
        File[] files = root.listFiles();
        for(File file:files){
            if(file.isDirectory()){
      /*
       * 递归调用
       */
                getFiles(file.getAbsolutePath());
                filelist.add(file.getAbsolutePath());
                System.out.println("显示"+filePath+"下所有子目录及其文件"+file.getAbsolutePath());
            }else{
                System.out.println("显示"+filePath+"下所有子目录"+file.getAbsolutePath());
            }
        }
    }

}
