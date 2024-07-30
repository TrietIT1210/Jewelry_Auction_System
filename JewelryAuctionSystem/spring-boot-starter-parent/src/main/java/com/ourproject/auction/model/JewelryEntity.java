package com.ourproject.auction.model;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "jewelry")
public class JewelryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jewelryId;
    private String name;
    private String description;
    private double minBidAmount;
    private String status;

}
