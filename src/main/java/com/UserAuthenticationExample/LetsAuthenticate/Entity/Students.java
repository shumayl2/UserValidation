package com.UserAuthenticationExample.LetsAuthenticate.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {

    @Id
    private String sid;

    private String name;

    private int roll;
}
