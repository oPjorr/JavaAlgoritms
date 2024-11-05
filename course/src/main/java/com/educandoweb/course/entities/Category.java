package com.educandoweb.course.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Category(){};
    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
