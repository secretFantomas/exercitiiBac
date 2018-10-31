package com.home.HotelAppServer.repository;

import com.home.HotelAppServer.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
