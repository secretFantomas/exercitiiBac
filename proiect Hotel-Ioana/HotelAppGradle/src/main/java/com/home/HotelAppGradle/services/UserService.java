package com.home.HotelAppGradle.services;

import com.home.HotelAppGradle.model.Role;
import com.home.HotelAppGradle.model.User;
import com.home.HotelAppGradle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        BCryptPasswordEncoder encoder = new  BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        Role userRole = new Role("user");
        List<Role> roles = new ArrayList<>();
        roles.add(userRole);
        user.setRoles(roles);
        userRepository.save(user);
    }

    public void createAdmin(User user) {
        BCryptPasswordEncoder  encoder = new  BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        Role userRole = new Role("admin");
        List<Role> roles = new ArrayList<>();
        roles.add(userRole);
        user.setRoles(roles);
        userRepository.save(user);
    }

    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }

    public boolean isUserPresent(String email) {
        User user = userRepository.findByEmail(email);
        if(user != null)
            return true;
        return false;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
