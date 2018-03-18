package com.mycompany.app.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="since_works")
@Access(AccessType.FIELD)
public class SinceWork
{
    @Id @GeneratedValue
    private int id;
    @Column(name = "name", length = 100)
    private String name;
    @Temporal(TemporalType.DATE)
    private Date getDay;

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

    public Date getGetDay() {
        return getDay;
    }

    public void setGetDay(Date getDay) {
        this.getDay = getDay;
    }
}
