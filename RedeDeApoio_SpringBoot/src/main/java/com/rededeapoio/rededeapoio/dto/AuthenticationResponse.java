package com.rededeapoio.rededeapoio.dto;

import com.rededeapoio.rededeapoio.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {
    private String jwt;
    private Long userId;
    private UserRole useRole;
}
