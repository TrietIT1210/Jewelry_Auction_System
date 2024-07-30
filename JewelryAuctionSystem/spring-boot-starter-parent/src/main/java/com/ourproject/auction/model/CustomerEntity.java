package com.ourproject.auction.model;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class CustomerEntity extends UserEntity {
    private String address;
    private String phoneNumber;

}

