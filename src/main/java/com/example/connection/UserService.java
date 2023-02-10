package com.example.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User added Sucessfully";
    }

    public User getUser(int id) {
      User user=userRepository.findById(id).get();
      return user;
    }
}
