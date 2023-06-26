package com.example.springvue2.controller;

import com.example.springvue2.dto.ResponseDto;
import com.example.springvue2.model.Person;
import com.example.springvue2.repository.UserRepository;
import com.example.springvue2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/")
//    public void showAll(){
//        System.out.println("showAll 호출됨");
//         userService.findAll();
//        //System.out.println("obj>>"+obj);
//    }
    public ResponseEntity<?> findAll(){
        System.out.println("showAll controller 호출됨");
        System.out.println(userService.findAll());
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/save")
    public ResponseDto<String> save(@RequestBody Person person){
        userService.join(person);
        return new ResponseDto<>("ok", 200);
    }


}
