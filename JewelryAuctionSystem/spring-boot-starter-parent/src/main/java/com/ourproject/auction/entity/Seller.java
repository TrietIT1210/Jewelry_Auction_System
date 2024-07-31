package com.ourproject.auction.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
@Table(name = "sellers")
public class Seller extends User {
    private String sellerName;
    private String address;
    private String sellerPhoneNumber;

}
