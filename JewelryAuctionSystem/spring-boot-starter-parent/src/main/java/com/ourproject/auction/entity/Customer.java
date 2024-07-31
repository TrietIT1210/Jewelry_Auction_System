package com.ourproject.auction.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer extends User {
    private String address;
    private String phoneNumber;

}

