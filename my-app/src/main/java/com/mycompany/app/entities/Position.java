package com.mycompany.app.entities;

import com.mycompany.app.entities.Lecture;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="positions")
public class Position {
    @Id @GeneratedValue
    @Column(name = "id")
    private int posId;
    @Column (name = "name", length = 45)
    private String name;
    @Column(name = "getDate")
    @Temporal(TemporalType.DATE)
    private Date getDate;

    public int getPosId() {
        return posId;
    }

    public void setPosId(int posId) {
        this.posId = posId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getGetDate() {
        return getDate;
    }

    public void setGetDate(Date getDate) {
        this.getDate = getDate;
    }
}
