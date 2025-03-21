package com.example.lionapi.entity;

import jakarta.persistence.*;
@Entity
public class Lion {

    @Id
    private int lionId;
    private String name;
    private String description;
    private double age;

    // Getters and Setters

    public int getLionId() {
        return lionId;
    }

    public void setLionId(int lionId) {
        this.lionId = lionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
