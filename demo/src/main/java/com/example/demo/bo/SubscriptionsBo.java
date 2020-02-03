package com.example.demo.bo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="subscriptions")
public class SubscriptionsBo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    long subscriptionId;
    @Getter
    @Setter
    long userId;
    @Getter
    @Setter
    String userName;
    @Getter
    @Setter
    long newspaperId;
    @Getter
    @Setter
    String newspaperName;
    @CreatedDate
    @Getter
    @Setter
    private Date subscriptionDate=new Date();

    public SubscriptionsBo(long userId,long newspaperId,String userName,String newspaperName) {
        this.userId = userId;
        this.newspaperId=newspaperId;
        this.userName=userName;
        this.newspaperName=newspaperName;
    }

    public SubscriptionsBo() {
    }
}
