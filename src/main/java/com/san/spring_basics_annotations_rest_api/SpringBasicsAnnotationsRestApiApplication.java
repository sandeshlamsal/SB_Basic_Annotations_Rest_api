package com.san.spring_basics_annotations_rest_api;

import com.san.spring_basics_annotations_rest_api.di.Bone;
import com.san.spring_basics_annotations_rest_api.di.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsAnnotationsRestApiApplication implements CommandLineRunner {

    @Autowired
    Human human;

    @Autowired
    Bone bone;

    public static void main(String[] args) {
        SpringApplication.run(SpringBasicsAnnotationsRestApiApplication.class, args);

    }

    //runs after main run()
    @Override
    public void run(String... args) throws Exception {
        human.doPump();

        //Bone count
        bone.display();
    }
}
