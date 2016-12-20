package com.mamad.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mamad.hibernate.model.UserDetails;
import com.mamad.spring.dao.UserDetailsDao;
import com.mamad.spring.service.UserDetailsService;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDetailsDao userDetailsDao;

    @Override
    public UserDetails getuserDetails(int id) {
        return userDetailsDao.getuserDetails(id);
    }

    @Override
    public List<UserDetails> getAllUserDetails() {
        return userDetailsDao.getAllUserDetails();
    }

    public UserDetailsDao getUserDetailsDao() {
        return userDetailsDao;
    }
    
    public void saveUserDetails(UserDetails userDetails){
    	userDetailsDao.saveUserDetails(userDetails);
    }

}