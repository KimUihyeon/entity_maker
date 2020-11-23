package com.study.entity.maker.model;

import com.study.entity.maker.datas.CommentConfig;
import com.study.entity.maker.enums.ClassAnnotationsEnums;
import com.study.entity.maker.enums.ClassTypeEnums;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Entiy
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */

@Data
@Builder
@AllArgsConstructor
public class Entity {

    private HashSet<String> classAnnotations = new HashSet<>();
    private ClassTypeEnums classType ;
    private String className;
    private String classComment;

    private List<Variable> Variable = new ArrayList<>();
    

}
