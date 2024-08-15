package com.diyor.secure.service;

import com.diyor.secure.model.UserPrincipal;
import com.diyor.secure.model.Users;
import com.diyor.secure.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailsService implements UserDetailsService {
   @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username);
        if (user == null) {
            System.out.println("User not founded");
            throw new UsernameNotFoundException("user not founded");
        }
        return new UserPrincipal(user);
    }
}
