package com.san.spring_basics_annotations_rest_api.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Human {

    //Field Autowiring
    @Autowired Heart heart;

    @Autowired Bone bone;

    public void doPump(){
        heart.pump();
    }
}
