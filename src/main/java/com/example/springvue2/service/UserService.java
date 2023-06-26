package com.example.springvue2.service;

import com.example.springvue2.model.Person;
import com.example.springvue2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void join(Person person){
        userRepository.save(person);
    }

    @Transactional
    public List<Person> findAll(){
        return userRepository.findAll();
    }

    @Transactional
    public Person update(@RequestParam int id, Person person  ){
        person.setDestination(person.getDestination());
        return userRepository.save(person);


    }


}
