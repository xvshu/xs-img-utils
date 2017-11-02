package com.xs.img.utils;

import java.util.*;
import java.io.*;

/**
 * Created by xvshu on 2017/11/2.
 */
public class FileRecursionPrint {

    /**
     * 找出某目录下某类型文件
     * @param fileType
     * @return
     */
    public static List<String> getAllFilePaths(String parentPath,String fileType) {
        if(fileType==null) {
            fileType = "jpg";
        }
        List<String> paths = new ArrayList<String>();
        paths = getAllFilePath(new File(parentPath), paths, fileType);
        return paths;
    }

    private static List<String> getAllFilePath(File filePath, List<String> filePaths, String fileType) {
        File[] files = filePath.listFiles();
        if (files == null) {
            return filePaths;
        }
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFilePath(f, filePaths, fileType);
            } else {
                String fName = f.getName();
                String tyle=fName.substring(fName.lastIndexOf(".")+1,fName.length());
                if(tyle.toUpperCase().equals(fileType.toUpperCase())){
                    filePaths.add(f.getPath());
                }

            }
        }
        return filePaths;
    }
}
