package com.study.entity.maker.datas;

import com.study.entity.maker.model.Entity;

import java.util.List;

/**
 * EntityDatas
 *
 * @author Kimuihyeon
 * @since 2020.11.16
 */
public class EntityDatas {

    public List<Entity> getFullEntity(){

        return null;
    }

    private void aaa(){


        Entity entity = Entity.builder()
                .ClassName("Member")
                .build();

    }


}
