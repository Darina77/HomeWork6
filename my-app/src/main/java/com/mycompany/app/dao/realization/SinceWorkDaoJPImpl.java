package com.mycompany.app.dao.realization;

import com.mycompany.app.dao.interfaces.SinceWorkDao;
import com.mycompany.app.entities.SinceWork;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class SinceWorkDaoJPImpl implements SinceWorkDao
{
    @PersistenceContext
    private EntityManager em;

    public SinceWork addSinceWork(SinceWork schedule) {
        em.persist(schedule);
        return schedule;
    }

    public SinceWork getSinceWork(int id) {
        return em.find(SinceWork.class,id);
    }

    public void saveSinceWork(SinceWork schedule) {
        em.merge(schedule);
    }
}