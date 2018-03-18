package com.mycompany.app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="rewards")
@Access(AccessType.FIELD)
public class Reward {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 100)
    private String name;
    @ManyToMany(mappedBy = "rewards", cascade = {CascadeType.MERGE})
    private List<Lecture> getByLectures;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Lecture> getGetByLectures() {
        return getByLectures;
    }

    public void setGetByLectures(List<Lecture> getByLectures) {
        this.getByLectures = getByLectures;
    }
}