package com.bridgelabz.userregitrationjwt.service;

import com.bridgelabz.userregitrationjwt.dto.UserLoginDTO;
import com.bridgelabz.userregitrationjwt.dto.UserRegistrationDTO;
import com.bridgelabz.userregitrationjwt.model.UserData;

import java.util.List;

public interface UserService {

    String loginUser(UserLoginDTO userLoginDTO);

    List<UserData> getUserInfo();

    UserData registerUser(UserRegistrationDTO userDTO);
}