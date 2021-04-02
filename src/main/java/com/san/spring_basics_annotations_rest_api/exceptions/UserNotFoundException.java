package com.san.spring_basics_annotations_rest_api.exceptions;

import org.springframework.http.ResponseEntity;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        System.out.println("User not found ! Provide Valid ID");
    }
}
