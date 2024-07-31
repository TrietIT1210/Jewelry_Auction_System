package com.ourproject.auction.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "admins")
public class Admin extends Employee {
    private String department;
}

