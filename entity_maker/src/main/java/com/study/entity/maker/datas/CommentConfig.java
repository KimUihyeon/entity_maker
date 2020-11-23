package com.study.entity.maker.datas;

/**
 * CommentConfig
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */
public class CommentConfig {

    public static String getClassComment(String className){

        String since = StringConfig.nowDate();
        String author = StringConfig.author;

        StringBuilder sb = new StringBuilder();
        sb.append("/**\n");
        sb.append(" * " + className + "\n");
        sb.append(" * \n");
        sb.append(" * @author " +author+ "\n");
        sb.append(" * @since " +since + "\n" );
        sb.append(" */");

        return sb.toString();
    }
}
