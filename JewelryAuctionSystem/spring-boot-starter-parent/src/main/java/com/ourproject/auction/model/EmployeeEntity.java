package com.ourproject.auction.model;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class EmployeeEntity extends UserEntity {
    private String position;

}