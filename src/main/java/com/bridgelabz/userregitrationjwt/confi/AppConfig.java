package com.bridgelabz.userregitrationjwt.confi;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
/***********************************************************************************************************************
 * Class : AppConif Class
 * @author : Himanshu
 **********************************************************************************************************************/
@Component
public class AppConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){

        return new BCryptPasswordEncoder();
    }

}