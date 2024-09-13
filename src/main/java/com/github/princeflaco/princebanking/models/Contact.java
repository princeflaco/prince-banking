package com.github.princeflaco.princebanking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false, length = 50)
    private String phoneNumber;
    @Column(nullable = false, length = 5)
    private String areaCode;

    @ManyToMany(mappedBy = "contacts")
    private Set<User> users = new LinkedHashSet<>();

}
