package com.mycompany.app.entities;

import com.mycompany.app.Faculty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@SecondaryTables({
        @SecondaryTable(name = "specialties"),
        @SecondaryTable(name = "course_subjects")
})
@Table(name = "group")
public class Group
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Enumerated(EnumType.STRING)
    @Column(table = "specialties", name = "facultyName")
    private Faculty facultyName;
    @Column(table = "specialties", name = "courseNum")
    private int courseNum;
    @Column(table = "specialties", name = "specialName")
    private String specialName;
    @Column(table = "course_subjects", name = "subjectName")
    private String subjectName;
    @OneToMany
    @JoinColumn(name = "group_id")
    private List<Schedule> schedules = new ArrayList<Schedule>();

   public String getSpecial() {
        return specialName;
    }

    public void setSpecial(String specialName) {
        this.specialName = specialName;
    }

    public String getSubject() {
        return subjectName;
    }

    public void setSubject(String subjectName) {
        this.subjectName = subjectName;
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

    public Faculty getFaculty() {
        return facultyName;
    }

    public void setFaculty(Faculty faculty) {
        this.facultyName = faculty;
    }

    public int getCourse() {
        return courseNum;
    }

    public void setCourse(int courseNum) {
        this.courseNum = courseNum;
    }
}


