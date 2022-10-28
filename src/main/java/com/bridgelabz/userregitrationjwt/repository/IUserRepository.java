package com.bridgelabz.userregitrationjwt.repository;

import com.bridgelabz.userregitrationjwt.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserData, Integer> {

}