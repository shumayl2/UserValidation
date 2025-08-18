package com.UserAuthenticationExample.LetsAuthenticate.Service;

import com.UserAuthenticationExample.LetsAuthenticate.Dto.LoginRequestdto;
import com.UserAuthenticationExample.LetsAuthenticate.Dto.LoginResponseDto;
import com.UserAuthenticationExample.LetsAuthenticate.Entity.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {


    private final AuthenticationManager authenticationManager;

    private final AuthUtil authUtil;

    public LoginResponseDto login(LoginRequestdto loginRequestdto) {

        //when we first login then we first need to get validated
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequestdto.getUsername(),loginRequestdto.getPassword()));



       Users users = (Users)authentication.getPrincipal();

       //ehen user is vailidated then we will generate a token for the user
        String token = authUtil.generateAccessToken(users);



        return new LoginResponseDto(token,users.getUid());

    }
}
