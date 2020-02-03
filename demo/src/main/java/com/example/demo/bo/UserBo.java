package com.example.demo.bo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.id.UUIDGenerationStrategy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class UserBo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    long id;
    @Getter
    @Setter
    String userName;
    @Getter
    @Setter
    String emailId;
    @Getter
    @Setter
    String phno;
    // @CreatedDate
    //@Getter
    //@Setter
    //private Date createdAt=new Date();

    @Getter
    @Setter
    String password;
    @Getter
    @Setter
    boolean active;
    @Getter
    @Setter
    String roles;

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    // public void setCreatedAt(Date createdAt) {
    // this.createdAt = createdAt;
    // }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhno() {
        return phno;
    }

    // public Date getCreatedAt() {
    //  return createdAt;
    //}

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public String getRoles() {
        return roles;
    }

    public UserBo(String name, String emailId, String phno) {
        this.userName=name;
        this.emailId=emailId;
        this.phno=phno;
    }

    public UserBo() {
    }
}

