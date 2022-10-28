package com.bridgelabz.userregitrationjwt.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserRegistrationDTO {
    public String firstName;
    public String lastName;
    public String emailId;
    public String password;

}