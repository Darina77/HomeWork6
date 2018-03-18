package com.mycompany.app;

import com.mycompany.app.dao.interfaces.LecturesDao;
import com.mycompany.app.entities.Lecture;
import org.springframework.beans.factory.annotation.Autowired;

public class LecturesWorker {
    @Autowired
    LecturesDao lecturesDao;
    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }
}

