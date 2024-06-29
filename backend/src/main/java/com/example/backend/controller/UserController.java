package com.example.backend.controller;

import com.example.backend.entity.UserEntity;
import com.example.backend.service.UserService;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping(value = "/save")
    public ResponseEntity<UserEntity>salvar(@RequestBody UserEntity user){
        UserEntity item=userService.salvar(user);
        return ResponseEntity.ok(item);
    }
    @GetMapping(value = "/all")
    public ResponseEntity<List<UserEntity>>buscar(){
        List<UserEntity> users=userService.buscar();
        return ResponseEntity.ok(users);
    }

}
