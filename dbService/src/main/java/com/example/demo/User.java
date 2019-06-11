package com.example.demo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class User implements Serializable {
    private static final long serialVersionUID=1L;

    String username;
    String password;
    public User(){
        super();
    }
    public User(String uid,String name,String pwd){
        super();
        this.uid=uid;
        username=name;
        password=pwd;
    }
    @Id
    @GenericGenerator(name="session_info_uuid_gen",strategy = "assigned")
    @GeneratedValue(generator = "session_info_uuid_gen")
    @Column(name="uid")
    String uid;
    public String getUid(){
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
