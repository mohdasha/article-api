package com.bitwse.article.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "users")
public class User {
    @Id
    private UUID id;
    @Column(name = "username", unique = true)
    private String username;
    private String password;
    private Boolean enabled = true;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<UserAuthority> userAuthorities = new ArrayList<>();

    public User() {
    }

    public User(User user) {
        this.id = user.id;
        this.username = user.username;
        this.password = user.password;
        this.enabled = user.enabled;
        this.userAuthorities = user.userAuthorities;
    }

    public User(UUID id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<UserAuthority> getUserAuthorities() {
        return userAuthorities;
    }

    public void setUserAuthorities(List<UserAuthority> userAuthorities) {
        this.userAuthorities = userAuthorities;
    }

    public void addAuthority(String authority) {
        this.userAuthorities.add(new UserAuthority(this, authority));
    }
}
