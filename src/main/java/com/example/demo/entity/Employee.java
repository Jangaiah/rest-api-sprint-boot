package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data   // generates getters, setters, toString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;
}
