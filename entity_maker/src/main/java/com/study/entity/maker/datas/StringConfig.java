package com.study.entity.maker.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * StringConfig
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */
public class StringConfig {

    public static String author = "kuh";


    public static String nowDate(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return df.format(date).toString();
    }

}
