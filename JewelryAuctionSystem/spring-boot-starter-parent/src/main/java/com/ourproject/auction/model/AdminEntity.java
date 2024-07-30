package com.ourproject.auction.model;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "admins")
public class AdminEntity extends EmployeeEntity {
    private String department;
}

