package com.api.api_usuarios.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api_usuarios.Model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	Optional<User> findByUsername(String username);
	
}
