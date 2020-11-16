package com.study.entity.maker.enums;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * ClassAnnotaionsEnums
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */
@Data
public class ClassAnnotationsEnums {

    public static String Builder = "@Builder";
    public static String Setter = "@Setter";
    public static String Getter = "@Getter";


    public static String Table = "@Table";
    public static String Entity = "@Entity";

    public static String NoArgsConstructor = "@NoArgsConstructor";
    public static String AllArgsConstructor = "@AllArgsConstructor";
}
