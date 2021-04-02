package com.san.spring_basics_annotations_rest_api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
to define page, add config on application.properites where the file exist
add 2 depdencies no pom.xml

        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
            <version>1.2</version>
        </dependency>

        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>


 */

//@RestController= @Controller + @ResponseBody

//@Controller = for MVC app, where you want to define a controller that return view
//@ResponseBody = if you want forcefully, to return string instead of view


@Controller //mvc should return view or string but not in json/xml format
public class UserMvcController {

    // m1 will return string as @ResonseBody is used, and on top @Controller is used
    @RequestMapping("/user/mvc/list")
    public @ResponseBody  String listUsers(){
        System.out.println("user list called");
        //return new String[]{"john","jack","macl"};
        return "sandesh";
    }

    @RequestMapping("/user/mvc/user")
    public String user(){
        System.out.println("user/mvc/user");
        return "sandesh";  //provide dispatcher servlet issue as no @ResponseBody
    }
}
