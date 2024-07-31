package com.ourproject.auction.model;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "auctions")
public class AuctionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auctionId;
    private Date startTime;
    private Date endTime;
    private String status;

}
