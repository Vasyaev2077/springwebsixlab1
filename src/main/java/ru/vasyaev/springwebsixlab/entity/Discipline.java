package ru.vasyaev.springwebsixlab.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "disciplines")
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotBlank
    private String name;

    @Column(name = "description")
    @NotBlank
    private String description;

    @Column(name = "weight")
    @NotNull
    @Min(value = 1)
    @Max(value = 10)
    private int weight;

    public Discipline(String name, String description, int weight) {
        this.name = name;
        this.description = description;
        this.weight= weight;
    }
}
