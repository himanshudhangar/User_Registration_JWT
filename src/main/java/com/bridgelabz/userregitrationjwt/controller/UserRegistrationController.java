package com.bridgelabz.userregitrationjwt.controller;


import com.bridgelabz.userregitrationjwt.dto.ResponseDTO;
import com.bridgelabz.userregitrationjwt.dto.UserLoginDTO;
import com.bridgelabz.userregitrationjwt.dto.UserRegistrationDTO;
import com.bridgelabz.userregitrationjwt.model.UserData;
import com.bridgelabz.userregitrationjwt.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/userregistration")
@Slf4j
@RestController
public class UserRegistrationController {

    @Autowired
    UserService IuserService;

    /**
     * Method :- Method for User Login.
     *
     * @param  :- passing UserRegistrationDTO as Input
     * @return :- Returning Token.
     */
    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> loginUser(@RequestBody UserLoginDTO userLoginDTO) {
        log.info("inside userLogin Controller Method");
        ResponseDTO responseDTO = new ResponseDTO("User Logged In Successfully!!!",
                IuserService.loginUser(userLoginDTO));
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    /**
     * Method :- Method for User Registration.
     *
     * @param userDTO :- passing UserRegistrationDTO as Input
     * @return :- Returning UserData
     */
    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> registerUser(@RequestBody UserRegistrationDTO userDTO) {
        UserData userData = null;
        log.info("inside registerUser Controller Method");
        userData = IuserService.registerUser(userDTO);
        ResponseDTO responseDTO = new ResponseDTO("User Added Successfully.", userData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.CREATED);
        
    }

    /**
     * Method :- Method to Get All User Records.
     *
     * @return :- Returning  All User Records Present in Database.
     */
    @GetMapping("/getUserInfo")
    public ResponseEntity<ResponseDTO> getUserInfo() {
        List<UserData> userDataList = null;
        userDataList = IuserService.getUserInfo();
        ResponseDTO responseDTO = new ResponseDTO("Getting User Info ", userDataList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}