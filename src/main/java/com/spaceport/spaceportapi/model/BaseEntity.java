package com.spaceport.spaceportapi.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    public int getId() {
        return id;
    }
}
