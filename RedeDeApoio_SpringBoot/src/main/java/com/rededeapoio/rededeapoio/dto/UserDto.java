package com.rededeapoio.rededeapoio.dto;

import com.rededeapoio.rededeapoio.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;

}
