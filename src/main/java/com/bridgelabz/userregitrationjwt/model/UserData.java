package com.bridgelabz.userregitrationjwt.model;

import com.bridgelabz.userregitrationjwt.dto.UserLoginDTO;
import com.bridgelabz.userregitrationjwt.dto.UserRegistrationDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "User_Data")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_Id")

    private int userId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;

    public UserData(){

    }
    public UserData(UserRegistrationDTO UserRegistrationDTO) {

        this.firstName = UserRegistrationDTO.firstName;
        this.lastName = UserRegistrationDTO.lastName;
        this.emailId = UserRegistrationDTO.emailId;
        this.password = UserRegistrationDTO.password;
    }

    public UserData(UserLoginDTO userLoginDTO) {
        this.emailId = userLoginDTO.emailId;
        this.password = userLoginDTO.password;
    }
}