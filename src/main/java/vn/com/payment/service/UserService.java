package vn.com.payment.service;

import vn.com.payment.dto.ApiResponse;
import vn.com.payment.dto.UserDTO;

public interface UserService {
	ApiResponse add(UserDTO dto);
	
	ApiResponse update(UserDTO dto);
	
	ApiResponse findById(String id);
}
