package com.mycompany.app.dao.realization;

import com.mycompany.app.entities.Schedule;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ScheduleDaoJPImpl
{
    @PersistenceContext
    private EntityManager em;

    public Schedule addSchedule(Schedule schedule) {
        em.persist(schedule);
        return schedule;
    }

    public Schedule getSchedule(int id) {
        return em.find(Schedule.class,id);
    }

    public void saveSchedule(Schedule schedule) {
        em.merge(schedule);
    }
}
