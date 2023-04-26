package com.example.whisky_tracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.PipedReader;
import java.io.Serializable;

@Entity
@Table(name = "whiskies")
public class Whisky {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int yearCreated;

    @Column
    private int age;

    @ManyToOne
    @JoinColumn(name = "distillery_id", nullable = false)
    @JsonIgnoreProperties({"whiskies"})
    private Distillery distillery;

    public Whisky(String name, int yearCreated, int age, Distillery distillery) {
        this.name = name;
        this.yearCreated = yearCreated;
        this.age = age;
        this.distillery = distillery;
    }

    public Whisky() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void setYearCreated(int year) {
        this.yearCreated = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Distillery getDistillery() {
        return distillery;
    }

    public void setDistillery(Distillery distillery) {
        this.distillery = distillery;
    }
}
