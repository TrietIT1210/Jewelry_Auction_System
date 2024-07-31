package com.ourproject.auction.entity;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "auctions")
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auctionId;
    private Date startTime;
    private Date endTime;
    private String status;

}
