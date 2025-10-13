package com.rededeapoio.RedeDeApoio_SpringBoot.enteties;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@Data
@Entity
public class User implements UserDetails {
}
