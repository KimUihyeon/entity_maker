package com.study.entity.maker.enums;

import lombok.Getter;



/**
 * DataTypeEnums
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */

public enum DataTypeEnums {

    STRING("String"),

    INT("String"),

    LONG("long"),

    LONG_OBJECT("Long");



    private String value;



    DataTypeEnums(String string) {
        this.value = string;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
