package com.example.service;

import com.example.dtos.LoginDto;
import com.example.dtos.UsersDto;

public interface UserService {
	public UsersDto saveUser(UsersDto userDto);
	public Integer getUserId(LoginDto logindto);
	public UsersDto editUser(UsersDto userDto);
	public void deleteUser(UsersDto userDto);
	

}
