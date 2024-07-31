package com.ourproject.auction.entity;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Table(name = "fees")
public class Fee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feeId;
    private String type;
    private double amount;

}