package com.sunforits.jiaocaizhengding.utils.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/6/6-9:17
 */

/**
 * 格式化的时间
 */
public class StringTime {

    //    得到字符串形式的日期时间
    public static String getStringTime() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        return simpleDateFormat.format(date);
    }

    public static String getFormatTime(String pattern) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        return simpleDateFormat.format(date);
    }

}
