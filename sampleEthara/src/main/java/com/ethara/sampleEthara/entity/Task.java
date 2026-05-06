package com.ethara.sampleEthara.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String status;
    private LocalDate dueDate;

    @ManyToOne
    private User assignedTo;

    @ManyToOne
    private Project project;
}
