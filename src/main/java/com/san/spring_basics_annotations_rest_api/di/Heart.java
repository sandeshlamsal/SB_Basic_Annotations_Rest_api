package com.san.spring_basics_annotations_rest_api.di;

import org.springframework.stereotype.Component;

@Component
public class Heart {
    public void pump(){
        System.out.println("Heart is pumping");
    }
}
