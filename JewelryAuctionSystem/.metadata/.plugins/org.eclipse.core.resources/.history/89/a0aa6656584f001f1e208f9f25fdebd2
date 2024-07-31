package com.ourproject.auction.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "jewelry")
public class Jewelry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jewelryId;
    private String name;
    private String description;
    private double minBidAmount;
    private String status;

}
