package com.diyor.secure.service;

import com.diyor.secure.model.Users;
import com.diyor.secure.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    @Autowired
    private JWTService jwtService;
    @Autowired
    private UserRepo userRepo;
    @Autowired
     AuthenticationManager manager;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    @Autowired
    private AuthenticationManager authenticationManager;

    public Users register(Users user) {
        user.setUserpassword(encoder.encode(user.getUserpassword()));
        return userRepo.save(user);
    }

    public String verify(Users user) {
        Authentication authentication =
                manager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getUserpassword()));
       if (authentication.isAuthenticated())
        return jwtService.generateToken(user.getUsername());

       else return "fail";

    }
}
