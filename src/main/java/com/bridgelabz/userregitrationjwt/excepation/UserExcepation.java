package com.bridgelabz.userregitrationjwt.excepation;

public class UserExcepation extends RuntimeException {
    public UserExcepation(String message) {
        super(message);
    }
}