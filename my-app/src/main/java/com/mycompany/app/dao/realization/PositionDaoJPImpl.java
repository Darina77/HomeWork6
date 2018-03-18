package com.mycompany.app.dao.realization;

import com.mycompany.app.dao.interfaces.PositionDao;
import com.mycompany.app.entities.Position;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class PositionDaoJPImpl implements PositionDao
{
    @PersistenceContext
    private EntityManager em;

    public Position addPosition(Position position) {
        em.persist(position);
        return position;
    }

    public Position getPosition(int id) {
        return em.find(Position.class,id);
    }

    public void savePosition(Position position) {
        em.merge(position);
    }
}