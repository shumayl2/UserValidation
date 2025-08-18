package com.UserAuthenticationExample.LetsAuthenticate.Controller;


import com.UserAuthenticationExample.LetsAuthenticate.Dto.LoginRequestDto;
import com.UserAuthenticationExample.LetsAuthenticate.Dto.LoginResponseDto;
import com.UserAuthenticationExample.LetsAuthenticate.Dto.SignUpResponseDto;
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
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequestdto){
        return new ResponseEntity<>(authService.login(loginRequestdto), HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponseDto> signup(@RequestBody LoginRequestDto signUpRequestDto) throws IllegalAccessException {
        return new ResponseEntity<>(authService.signup(signUpRequestDto),HttpStatus.OK);
    }
}
