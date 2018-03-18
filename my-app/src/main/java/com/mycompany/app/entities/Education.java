package com.mycompany.app.entities;

import javax.persistence.*;
import java.util.Date;

@Embeddable
public class Education {
    private String diplomaId;
    @Temporal(TemporalType.DATE)
    private Date diplomaDate;
    @Column(length = 100)
    private String place;
    private String degree;

    public String getDiplomaId() {
        return diplomaId;
    }

    public void setDiplomaId(String diplomaId) {
        this.diplomaId = diplomaId;
    }

    public Date getDiplomaDate() {
        return diplomaDate;
    }

    public void setDiplomaDate(Date diplomaDate) {
        this.diplomaDate = diplomaDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
