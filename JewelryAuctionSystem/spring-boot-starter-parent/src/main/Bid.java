package com.ourproject.auction.entity;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "bids")
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bidId;
    private Long auctionId;
    private Long customerId;
    private double amount;
    private Date timestamp;

}