package com.rededeapoio.rededeapoio.services.auth;

import com.rededeapoio.rededeapoio.dto.SignupRequest;
import com.rededeapoio.rededeapoio.dto.UserDto;

public interface AuthService {

    UserDto signupUser(SignupRequest signupRequest)
}
