package com.example.jumptospringboot.domain;

import jakarta.persistence.*;
import lombok.*;


@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class SiteUser {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

    @Column(unique = true) private String username;

    private String password;

    @Column(unique = true) private String email;
}
