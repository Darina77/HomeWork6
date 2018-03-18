package com.mycompany.app.entities;

import org.omg.CORBA.Object;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Schedule
{
    @EmbeddedId
    SchecludeId id;
    @Column(name = "day")
    private int day;
    @Column(name = "lesson", nullable = false, updatable = false)
    private int lesson;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public SchecludeId getId() {
        return id;
    }

    public void setId(SchecludeId id) {
        this.id = id;
    }

    public int getLesson() {
        return lesson;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }
}

@Embeddable
class SchecludeId implements Serializable
{
    private int lectureId;
    private int groupId;

    public SchecludeId() {}

    public boolean equals(Object o)
    {
        if (o == this) return true;
        else if (o.getClass() == this.getClass())
        {
            SchecludeId so = (SchecludeId) o;
            if (so.getLectureId() == this.getLectureId())
            {
                if (so.getGroupId() == this.getGroupId())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode()
    {
       int result = 31 + lectureId;
       result = result*31 + groupId;
       return result;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
