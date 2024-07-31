package com.ourproject.auction.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    private String email;
}
