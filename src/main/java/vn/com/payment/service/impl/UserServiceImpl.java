/**
 * 
 */
package vn.com.payment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import vn.com.payment.dto.ApiResponse;
import vn.com.payment.dto.UserDTO;
import vn.com.payment.repository.UserRepository;
import vn.com.payment.service.UserService;

/**
 * @author DELL
 *
 */
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repo;

	@Override
	public ApiResponse add(UserDTO dto) {
		ApiResponse response = new ApiResponse();
		return response;
	}

	@Override
	public ApiResponse update(UserDTO dto) {
		ApiResponse response = new ApiResponse();
		return response;
	}

	@Override
	public ApiResponse findById(String id) {
		ApiResponse response = new ApiResponse();
		return response;
	}

}
