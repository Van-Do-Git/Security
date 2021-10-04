package com.codegym.bai17p32.model;


import javax.persistence.*;

@Entity
public class AppUser {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;

    @ManyToOne
    private AppRole roll;

    public AppUser(Long id, String username, String password, AppRole roll) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roll = roll;
    }

    public AppUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public AppRole getRoll() {
        return roll;
    }

    public void setRoll(AppRole roll) {
        this.roll = roll;
    }
}
