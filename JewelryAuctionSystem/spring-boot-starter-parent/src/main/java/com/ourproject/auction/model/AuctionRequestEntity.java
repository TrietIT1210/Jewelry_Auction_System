package com.ourproject.auction.model;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "auction_requests")
public class AuctionRequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;
    private Long jewelryId;
    private double startingBid;
    private double minIncrement;
    private String status;
}
