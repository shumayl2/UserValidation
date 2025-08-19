package com.UserAuthenticationExample.LetsAuthenticate.Repository;

import com.UserAuthenticationExample.LetsAuthenticate.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students,String> {


}
