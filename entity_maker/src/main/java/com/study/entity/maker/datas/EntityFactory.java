package com.study.entity.maker.datas;

import com.study.entity.maker.enums.ClassAnnotationsEnums;
import com.study.entity.maker.enums.DataTypeEnums;
import com.study.entity.maker.model.Entity;
import com.study.entity.maker.model.Variable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * EntityDatas
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */
public class EntityFactory {

    public List<Entity> getFullEntity(){

        return null;
    }

    private Entity defaultEntity(String className){
        List<Variable> vars = new ArrayList<>();
        vars.add(new Variable(DataTypeEnums.LONG_OBJECT, "id", true));
        HashSet<String> classAnnotationsEnums = new HashSet<>();


        classAnnotationsEnums.add(ClassAnnotationsEnums.Builder);
        classAnnotationsEnums.add(ClassAnnotationsEnums.Getter);
        classAnnotationsEnums.add(ClassAnnotationsEnums.Table);
        classAnnotationsEnums.add(ClassAnnotationsEnums.AllArgsConstructor);
        classAnnotationsEnums.add(ClassAnnotationsEnums.NoArgsConstructor);


        Entity entity = Entity.builder()
                .className(className)
                .Variable(vars)
                .classAnnotations(classAnnotationsEnums)
                .classComment(CommentConfig.getClassComment(className))
                .build();
        return entity;
    }

    public void memberEntity(){
        Entity memberEntity = defaultEntity("Member");
        memberEntity.getVariable().add();


    }


}
