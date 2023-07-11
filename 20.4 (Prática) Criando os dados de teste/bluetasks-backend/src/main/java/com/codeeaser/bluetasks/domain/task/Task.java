package com.codeeaser.bluetasks.domain.task;

import java.time.LocalDate;

import com.codeeaser.bluetasks.domain.user.AppUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
    
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    @Column(name="when_to_do")
    private LocalDate whenToDo;

    private Boolean done;

    @ManyToOne
    @JoinColumn(name="app_user_id")
    private AppUser appUser;

    
    public Task(Long id, String description, LocalDate whenToDo, Boolean done) {
        this.id = id;
        this.description = description;
        this.whenToDo = whenToDo;
        this.done = done;
    }
    
    public Task() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getWhenToDo() {
        return whenToDo;
    }

    public void setWhenToDo(LocalDate whenToDo) {
        this.whenToDo = whenToDo;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
    
}
