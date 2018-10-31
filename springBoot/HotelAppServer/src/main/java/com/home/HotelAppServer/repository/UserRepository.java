package com.home.HotelAppServer.repository;


import com.home.HotelAppServer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//primul parametrul e tipul obiectului, iar cel de-al doilea este cheia primara
    public interface UserRepository extends JpaRepository<User, Integer> {

    }

