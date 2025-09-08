package com.UserAuthenticationExample.LetsAuthenticate.Service;

import com.UserAuthenticationExample.LetsAuthenticate.Dto.LoginRequestDto;
import com.UserAuthenticationExample.LetsAuthenticate.Dto.LoginResponseDto;
import com.UserAuthenticationExample.LetsAuthenticate.Dto.SignUpResponseDto;
import com.UserAuthenticationExample.LetsAuthenticate.Entity.Users;
import com.UserAuthenticationExample.LetsAuthenticate.Repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthService {


    private final AuthenticationManager authenticationManager;


    private final AuthUtil authUtil;


    private final UserRepo userRepo;

    private final PasswordEncoder passwordEncoder;

    public LoginResponseDto login(LoginRequestDto loginRequestdto) {

        //when we first login then we first need to get validated
        Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequestdto.getUsername(),loginRequestdto.getPassword()));

        //bhai yaha hum ek her baar ek naya object pass ker rahie hai jissei humei authentoicate kernawana hai
        //new keyword use ker jkei her baar ek user ka naya object create hota hai yei toh humei pata hi hai 



       Users users = (Users)authentication.getPrincipal();

       //ehen user is vailidated then we will generate a token for the user
        String token = authUtil.generateAccessToken(users);



        return new LoginResponseDto(token,users.getUid());

    }

    public SignUpResponseDto signup(LoginRequestDto signUpRequestDto) throws IllegalAccessException {
        Users users = userRepo.findByUsername(signUpRequestDto.getUsername()).orElse(null);

        if(users != null)
            throw new IllegalAccessException("User already exists");

        users = userRepo.save(Users.builder()
                        .uid(UUID.randomUUID().toString())
                .username(signUpRequestDto.getUsername())
                        .password(passwordEncoder.encode(signUpRequestDto.getPassword()))
                .build());

        return new SignUpResponseDto(users.getUid(),users.getUsername());

    }
}
