package com.mycompany.app.dao.interfaces;

import com.mycompany.app.entities.Lecture;

public interface LecturesDao {
    Lecture addLecture(Lecture lecture);
    Lecture getLecture(int id);
    void saveLecture(Lecture lecture);
}

