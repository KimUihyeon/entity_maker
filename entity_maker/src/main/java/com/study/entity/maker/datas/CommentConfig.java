package com.study.entity.maker.datas;

/**
 * CommentConfig
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */
public class CommentConfig {

    public String getClassComment(String className, String author, String since){
        StringBuilder sb = new StringBuilder();
        sb.append("/**");
        sb.append("/* " + className);
        sb.append("/* @author " );
        sb.append("/**");
        sb.append("/**");

        return "";
    }
}
