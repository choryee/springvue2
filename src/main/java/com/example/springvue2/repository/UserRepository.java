package com.example.springvue2.repository;

import com.example.springvue2.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Integer> {
}
