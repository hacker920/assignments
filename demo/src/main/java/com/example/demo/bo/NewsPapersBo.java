package com.example.demo.bo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="news_paper")
public class NewsPapersBo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    long id;
    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    long price;
    public NewsPapersBo(long id,String name,long price) {
        this.id = id;
        this.name=name;
        this.price=price;
    }
}
