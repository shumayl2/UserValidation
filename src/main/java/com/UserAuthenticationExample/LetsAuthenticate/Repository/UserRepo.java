package com.UserAuthenticationExample.LetsAuthenticate.Repository;

import com.UserAuthenticationExample.LetsAuthenticate.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepo extends JpaRepository<Users,String> {

   Optional<Users> findByUsername(String username);
}
