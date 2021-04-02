package com.san.spring_basics_annotations_rest_api.di;

import org.springframework.context.annotation.Bean;


public class Bone {
    private int count=28;
    public void display(){
        System.out.println("Bone count is"+count);
    }
}
