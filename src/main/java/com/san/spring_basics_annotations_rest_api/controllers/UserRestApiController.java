package com.san.spring_basics_annotations_rest_api.controllers;

import com.san.spring_basics_annotations_rest_api.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/* */
@RestController
public class UserRestApiController {

    @RequestMapping("/user/api/list")
    public ArrayList<User> getUsersList(){
        ArrayList<User> users=new ArrayList<User>();
        users.add(new User(1,"jack"));
        users.add(new User(2,"John"));
        return users;

        //[{"id":1,"name":"jack"},{"id":2,"name":"John"}] will be displayed
    }
}
