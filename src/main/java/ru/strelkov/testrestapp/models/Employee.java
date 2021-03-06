package ru.strelkov.testrestapp.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String position;
    private long salary;
}
