package com.study.entity.maker.model;

import com.study.entity.maker.enums.ClassAnnotationsEnums;
import com.study.entity.maker.enums.DataTypeEnums;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Variable
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */

@Data
@AllArgsConstructor
public class Variable {

    private DataTypeEnums datatype;

    private String Default;

    private String VariableName;

    private HashSet<String> variableAnnotations = new HashSet<>();


    private void init(DataTypeEnums type, String name, boolean isID){
        this.datatype = type;
        this.VariableName = name;

        if(isID == true){
            variableAnnotations.add(ClassAnnotationsEnums.Id);
            variableAnnotations.add(ClassAnnotationsEnums.Table);
            variableAnnotations.add(ClassAnnotationsEnums.Entity);
        }
    }

    public Variable(DataTypeEnums type, String name, boolean isID){
        init(type, name , isID);
    }

    public Variable(DataTypeEnums type, String name){
        init(type, name, false);
    }

    public Variable(DataTypeEnums type, String name,HashSet<String> annotations , boolean isId) {
        this.variableAnnotations = annotations;
        init(type, name , isId);
    }
}
