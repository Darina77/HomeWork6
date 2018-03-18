package com.mycompany.app.dao.interfaces;

import com.mycompany.app.entities.Schedule;

public interface ScheduleDao {
    Schedule addSchedule(Schedule schedule);
    Schedule getSchedule(int id);
    void saveSchedule(Schedule schedule);
}