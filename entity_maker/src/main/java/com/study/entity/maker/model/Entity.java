package com.study.entity.maker.model;

import com.study.entity.maker.enums.ClassAnnotationsEnums;
import com.study.entity.maker.enums.ClassTypeEnums;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Entiy
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */

@Builder
@Data
@AllArgsConstructor
public class Entity {

    private List<String> classAnnotations = new ArrayList<>();
    private ClassTypeEnums classType ;
    private String ClassName;
    private String classComment;

    private List<Variable> Variable = new ArrayList<>();

    public Entity(){
        classAnnotations.add(ClassAnnotationsEnums.Builder);
        classAnnotations.add(ClassAnnotationsEnums.Getter);
        classAnnotations.add(ClassAnnotationsEnums.Table);
        classAnnotations.add(ClassAnnotationsEnums.AllArgsConstructor);
        classAnnotations.add(ClassAnnotationsEnums.NoArgsConstructor);
    }

}
