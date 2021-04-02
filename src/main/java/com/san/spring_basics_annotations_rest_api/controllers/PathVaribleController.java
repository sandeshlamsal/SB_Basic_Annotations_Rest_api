package com.san.spring_basics_annotations_rest_api.controllers;

import com.san.spring_basics_annotations_rest_api.entity.User;
import com.san.spring_basics_annotations_rest_api.entity.UserService;
import com.san.spring_basics_annotations_rest_api.entity.UserServiceImpl;
import com.san.spring_basics_annotations_rest_api.exceptions.UserNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PathVaribleController {

    @RequestMapping("/user/{id}")
        public ResponseEntity<User> getSingleUser(@PathVariable int id){
        //get list of users
        //list user if id exists, else call own exception
        UserServiceImpl userService=new UserServiceImpl();
        User us=userService.findUserById(id);
        if(us==null){
            //throw new UserNotFoundException();  //provide ResponseEntity , which is compatible with rest Api

            //ADD HEADER INFO
            HttpHeaders header=new HttpHeaders();
            header.add("id","id is not available"+id);

            //ADDING TO BODY
            String msg="Can't search user with id"+id;
            return new ResponseEntity(msg,header ,HttpStatus.NOT_FOUND);

            //BEST WAY IS TO MAKE OBJECT FOR MSG< HEADER AND SENT THE OBJECT
        }
        return new ResponseEntity<>(us,HttpStatus.OK);
    }
}
