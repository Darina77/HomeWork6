package com.mycompany.app;

import com.mycompany.app.dao.interfaces.ScheduleDao;
import com.mycompany.app.entities.Schedule;
import org.springframework.beans.factory.annotation.Autowired;

public class ScheduleWorker
{
    @Autowired
    ScheduleDao scheduleDao;
    public Schedule addSchedule(Schedule schedule){
        schedule = scheduleDao.addSchedule(schedule);
        System.out.println(schedule);
        return schedule;
    }
}
