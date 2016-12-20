package com.mamad.spring.service;


import java.util.List;

import com.mamad.hibernate.model.UserDetails;

public interface UserDetailsService {

    public UserDetails getuserDetails(int id);

    public List<UserDetails> getAllUserDetails();
    public void saveUserDetails(UserDetails userDetails);

}