package com.home.HotelAppGradle.repository;

import com.home.HotelAppGradle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByEmail(String email);

}
