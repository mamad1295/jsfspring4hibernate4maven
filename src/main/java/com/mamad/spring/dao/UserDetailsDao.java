package com.mamad.spring.dao;


import java.util.List;

import com.mamad.hibernate.model.UserDetails;

public interface UserDetailsDao {

    public UserDetails getuserDetails(int id);

    public List<UserDetails> getAllUserDetails();
    
    public void saveUserDetails(UserDetails userDetails);

}