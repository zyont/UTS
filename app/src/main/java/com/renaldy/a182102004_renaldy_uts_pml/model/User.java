package com.renaldy.a182102004_renaldy_uts_pml.model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;
    @SerializedName("username")
    private String username;
    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    public User(Integer id, String username, String name, String email){
        this.id = id;
        this.username = username;
        this.name = name;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
