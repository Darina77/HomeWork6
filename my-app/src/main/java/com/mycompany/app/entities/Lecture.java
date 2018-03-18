package com.mycompany.app.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="lectures")
@Access(AccessType.FIELD)
public class Lecture
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "name", length = 45, nullable = false)
    private String name;
    @Column(name = "credits")
    private double credits;
    @Basic(fetch = FetchType.LAZY)
    @Lob
    private byte[] photo;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Embedded
    private Education education;
    @OneToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "position_fk")
    private Position position;
    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name = "jnd_lectr_rewrd",
            joinColumns = @JoinColumn(name = "lector_fk"),
            inverseJoinColumns = @JoinColumn(name = "reward_fk"))
    private List<Reward> rewards = new ArrayList<Reward>();
    @OneToMany(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "lecture_fk")
    private List<SinceWork> works = new ArrayList<SinceWork>();
    @OneToMany
    @JoinColumn(name = "lector_id")
    private List<Schedule> schedules = new ArrayList<Schedule>();

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

   public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

    public List<SinceWork> getWorks() {
        return works;
    }

    public void setWorks(List<SinceWork> works) {
        this.works = works;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

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

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}

