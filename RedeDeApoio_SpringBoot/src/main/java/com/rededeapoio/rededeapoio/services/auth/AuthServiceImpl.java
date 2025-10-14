package com.rededeapoio.rededeapoio.services.auth;

import com.rededeapoio.rededeapoio.entities.User;
import com.rededeapoio.rededeapoio.enums.UserRole;
import com.rededeapoio.rededeapoio.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
    private final UserRepository userRepository;

    public void createAnAdminAccount(){
        Optional<User> optionalUser = userRepository.findByUserRole(UserRole.ADMIN);

    }

}
