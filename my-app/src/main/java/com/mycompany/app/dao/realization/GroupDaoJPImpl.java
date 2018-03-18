package com.mycompany.app.dao.realization;

import com.mycompany.app.dao.interfaces.GroupDao;
import com.mycompany.app.entities.Group;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class GroupDaoJPImpl implements GroupDao
{
    @PersistenceContext
    private EntityManager em;

    public Group addGroup(Group group) {
        em.persist(group);
        return group;
    }

    public Group getGroup(int id) {
        return em.find(Group.class,id);
    }

    public void saveGroup(Group group) {
        em.merge(group);
    }
}