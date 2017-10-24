package com.cv4j.piccrawler;

import java.io.*;
import java.util.UUID;

/**
 * Created by tony on 2017/10/10.
 */
public class Utils {

    /**
     * 生成随机数<br>
     * GUID： 即Globally Unique Identifier（全球唯一标识符） 也称作 UUID(Universally Unique
     * IDentifier) 。
     * <p>
     * 所以GUID就是UUID。
     * <p>
     * GUID是一个128位长的数字，一般用16进制表示。算法的核心思想是结合机器的网卡、当地时间、一个随即数来生成GUID。
     * <p>
     * 从理论上讲，如果一台机器每秒产生10000000个GUID，则可以保证（概率意义上）3240年不重复。
     *
     * @return
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 创建默认的文件夹用于存放图片
     * @param directory
     */
    public static File mkDefaultDir(File directory) {

        directory = new File("images");
        if (!directory.exists()) {
            directory.mkdir();
        }

        return directory;
    }
}
