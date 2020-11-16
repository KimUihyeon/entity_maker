package com.study.entity.maker.enums;

import lombok.Getter;



/**
 * DataTypeEnums
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */

@Getter
public class DataTypeEnums {

    private String STRING =  "String";
    private String INT =  "int";
    private String LONG_OBJECT =  "Long";
    private String LONG =  "long";
    private String TimeStamp =  "Timestamp";

    public String setClassType(String dataType){
        return dataType;
    }

}
