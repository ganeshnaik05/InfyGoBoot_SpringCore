package com.naigan.irs.repository;

import com.naigan.irs.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface UserRepository  extends JpaRepository<UserEntity,String> {
//    private String successMessage = "UserRepository.REGISTRATION_SUCCESS";
//
//    public String registerUser(){
//        return successMessage;
//    }
}
