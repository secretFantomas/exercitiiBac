package com.home.HotelAppGradle.repository;

import com.home.HotelAppGradle.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
