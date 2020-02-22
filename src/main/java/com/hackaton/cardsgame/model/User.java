package com.hackaton.cardsgame.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID uuid;
    @Column
    private String name;

    @ManyToOne
    private Room room;
}
