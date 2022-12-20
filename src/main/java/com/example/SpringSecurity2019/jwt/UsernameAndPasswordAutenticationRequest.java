package com.example.SpringSecurity2019.jwt;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsernameAndPasswordAutenticationRequest {
    private String username;
    private String password;

    public UsernameAndPasswordAutenticationRequest() {
    }
}
