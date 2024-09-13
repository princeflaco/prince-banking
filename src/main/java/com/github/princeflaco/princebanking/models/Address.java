package com.github.princeflaco.princebanking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_adressess")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false, length = 50)
    private String street;
    @Column(nullable = false, length = 50)
    private String city;
    @Column(nullable = false, length = 20)
    private String state;
    @Column(nullable = false, length = 15)
    private String zip;
    @Column(nullable = false, length = 20)
    private String country;
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
