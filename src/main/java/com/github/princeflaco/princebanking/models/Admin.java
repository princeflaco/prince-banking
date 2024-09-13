package com.github.princeflaco.princebanking.models;

import com.github.princeflaco.princebanking.models.enums.AdminLevel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Admin extends User{
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AdminLevel adminLevel;
}
