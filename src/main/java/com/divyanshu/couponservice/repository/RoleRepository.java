package com.divyanshu.couponservice.repository;

import com.divyanshu.couponservice.model.Role;
import com.divyanshu.couponservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
