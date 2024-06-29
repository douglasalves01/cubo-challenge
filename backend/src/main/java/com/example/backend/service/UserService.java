package com.example.backend.service;

import com.example.backend.entity.UserEntity;
import com.example.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity salvar(UserEntity user){
        return userRepository.save(user);
    }
    public List<UserEntity> buscar(){
        return userRepository.findAll();
    }
}
