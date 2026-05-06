package com.ethara.sampleEthara.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToOne
    private User owner;
}
