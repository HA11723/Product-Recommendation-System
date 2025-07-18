package com.recommendation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table; // ✅ import this!


@Entity
@Table(name = "users") // ✅ this line fixes the SQL issue
public class User {

    @Id
    private Long id;

    private String name;
    private String email;

    public User() {}

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
