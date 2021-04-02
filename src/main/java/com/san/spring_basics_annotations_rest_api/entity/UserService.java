package com.san.spring_basics_annotations_rest_api.entity;

import java.util.ArrayList;

public interface UserService {
     ArrayList<User> getAllUsers();
     User findUserById(int id);
}
