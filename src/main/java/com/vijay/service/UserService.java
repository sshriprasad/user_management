package com.vijay.service;

import com.vijay.dto.UserDto;
import com.vijay.entity.User;

public interface UserService {
	
	User save(UserDto userDto);
	

}
