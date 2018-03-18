package com.mycompany.app.dao.realization;

import com.mycompany.app.dao.interfaces.RewardDao;
import com.mycompany.app.entities.Reward;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class RewardDaoJPImpl implements RewardDao
{
    @PersistenceContext
    private EntityManager em;

    public Reward addReward(Reward reward) {
        em.persist(reward);
        return reward;
    }

    public Reward getReward(int id) {
        return em.find(Reward.class,id);
    }

    public void saveReward(Reward reward) {
        em.merge(reward);
    }
}
