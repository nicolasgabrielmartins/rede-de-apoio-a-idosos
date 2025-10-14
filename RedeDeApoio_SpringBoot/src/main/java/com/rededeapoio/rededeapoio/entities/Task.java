package com.rededeapoio.rededeapoio.entities;

import com.rededeapoio.rededeapoio.enums.StatusTask;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Task {
    @Id
    private Long id;
    private String description;
    private String type;
    private Date date_;
    @Enumerated(EnumType.STRING)
    private StatusTask status;

}
