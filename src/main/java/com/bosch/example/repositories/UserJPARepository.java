package com.bosch.example.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.bosch.example.model.User;

public interface UserJPARepository extends JpaRepository<User, Long>{}
