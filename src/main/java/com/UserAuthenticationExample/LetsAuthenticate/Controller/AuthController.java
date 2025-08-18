package com.UserAuthenticationExample.LetsAuthenticate.Controller;


import com.UserAuthenticationExample.LetsAuthenticate.Dto.LoginRequestdto;
import com.UserAuthenticationExample.LetsAuthenticate.Dto.LoginResponseDto;
import com.UserAuthenticationExample.LetsAuthenticate.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestdto loginRequestdto){
        return new ResponseEntity<>(authService.login(loginRequestdto), HttpStatus.OK);
    }
}
