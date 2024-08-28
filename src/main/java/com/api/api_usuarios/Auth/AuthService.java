package com.api.api_usuarios.Auth;

import org.springframework.stereotype.Service;

import com.api.api_usuarios.Model.User;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

	public AuthResponse login(LoginRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public AuthResponse register(RegisterRequest request) {
		User user = User.builder()
				.username(request.getUsername())
				.password(request.getPassword())
				.firstname(request.getFirstname())
				.lastname(request.getLastname())
				.country(request.getCountry())
				.role(request.getRole())
				.build();
		
	}

}
