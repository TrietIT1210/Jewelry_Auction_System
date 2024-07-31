package com.ourproject.auction.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "auction_requests")
public class AuctionRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;
    private Long jewelryId;
    private double startingBid;
    private double minIncrement;
    private String status;
}
