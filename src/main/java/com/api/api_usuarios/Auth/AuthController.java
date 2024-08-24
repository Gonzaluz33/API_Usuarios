package com.api.api_usuarios.Auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
	
	
	@PostMapping(value = "login")
	public String Login() {
		return "Login From public Endpoint";
	}
	@PostMapping(value = "register")
	public String Register() {
		return "Register From public Endpoint";
	}
	
	

}
