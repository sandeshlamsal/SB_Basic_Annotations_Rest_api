package com.san.spring_basics_annotations_rest_api.entity;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {

    ArrayList<User> users=new ArrayList<>();

    public UserServiceImpl(){
        users.add(new User(1,"John"));
        users.add(new User(2,"Jack"));
    }

    @Override
    public ArrayList<User> getAllUsers() {
        return users;
    }

    @Override
    public User findUserById(int id) {
        User user=null;
          for(User u:users){
            if(u.getId()==id){
                return u;
            }
        }
          return user;
    }
}
