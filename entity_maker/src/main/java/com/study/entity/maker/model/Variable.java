package com.study.entity.maker.model;

import com.study.entity.maker.enums.DataTypeEnums;
import lombok.Data;

import java.util.List;

/**
 * Variable
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */

@Data
public class Variable {

    private DataTypeEnums datatype;

    private String Default;

    private String VariableName;

    private List<String> variableAnnotations;
}
