package com.codeeaser.bluetasks.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "app_user")
public class AppUser {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String username;
    
    private String password;
    
    private String displayName;

    public AppUser(Long id, String username, String password, String displayName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayName = displayName;
    }

    public AppUser() {

    }
    
    public Long getId() {
        return id;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    
}
