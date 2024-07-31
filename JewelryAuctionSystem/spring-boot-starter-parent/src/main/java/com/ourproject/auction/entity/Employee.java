package com.ourproject.auction.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee extends User {
    private String position;

}