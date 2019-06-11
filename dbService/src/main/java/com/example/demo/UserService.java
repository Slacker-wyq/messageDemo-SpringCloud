package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;

    @Transactional
    public void save(User user){
        userRepository.save(user);

    }
    public User selectByKey(String uid){
        return userRepository.findById(uid).get();
    }

}
