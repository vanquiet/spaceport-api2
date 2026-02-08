package com.spaceport.spaceportapi.model;

import jakarta.persistence.Entity;

@Entity
public class Pilot extends BaseEntity {

    private String name;
    private String license;

    public Pilot() {
    }

    public Pilot(String name, String license) {
        this.name = name;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }
}
