package com.mycompany.app;


import com.mycompany.app.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Lecture lecture = new Lecture();
        lecture.setName("Introduction to Spring");
        lecture.setCredits(2.5);
        lecture.setDateOfBirth(new Date(1980, 11, 3));
        Education education = new Education();
        education.setDegree("доцент");
        education.setDiplomaDate(new Date(2014, 7, 4));
        education.setPlace("НаУКМА");
        education.setDiplomaDate(new Date(2004, 10, 16));
        lecture.setEducation(education);
        LecturesWorker worker = (LecturesWorker)context.getBean("worker");
        Group group = new Group();
        group.setCourse(1);
        group.setFaculty(Faculty.valueOf("FI"));
        group.setSpecial("ПІ");
        group.setSubject("Test");
        GroupsWorker worker1 = (GroupsWorker)context.getBean("worker1");
        Position position = new Position();
        position.setName("Викладач");
        position.setGetDate(new Date(2009, 8, 25));
        lecture.setPosition(position);
        PositionWorker worker2 = (PositionWorker)context.getBean("worker2");
        Reward reward = new Reward();
        List<Lecture> list = new ArrayList<Lecture>();
        list.add(lecture);
        reward.setGetByLectures(list);
        reward.setName("kk");
        List<Reward> rewardList = new ArrayList<Reward>();
        rewardList.add(reward);
        lecture.setRewards(rewardList);
        RewardWorker worker3 = (RewardWorker) context.getBean("worker3");
        SinceWork sinceWork = new SinceWork();
        sinceWork.setGetDay(new Date(2013, 4, 3));
        sinceWork.setName("oo");
        List<SinceWork> sinceWorksList = new ArrayList<SinceWork>();
        sinceWorksList.add(sinceWork);
        lecture.setWorks(sinceWorksList);
        SinceWorkWorker worker4 = (SinceWorkWorker) context.getBean("worker4");
        /*Schedule schedule = new Schedule();
        schedule.setDay(2);
        schedule.setLesson(2);
        List<Schedule> scheduleList = new ArrayList<Schedule>();
        scheduleList.add(schedule);
      //  lecture.setSchedules(scheduleList);
        //group.setSchedules(scheduleList);
        ScheduleWorker worker5 = (ScheduleWorker) context.getBean("worker5");*/
        worker1.addGroup(group);
        worker4.addSinceWork(sinceWork);
        worker2.addPosition(position);
        worker3.addReward(reward);
        worker.addLecture(lecture);




        /*worker5.addSchedule(schedule);*/
    }

}
