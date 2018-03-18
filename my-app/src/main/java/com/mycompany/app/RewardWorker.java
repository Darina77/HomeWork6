package com.mycompany.app;

import com.mycompany.app.dao.interfaces.RewardDao;
import com.mycompany.app.entities.Reward;
import org.springframework.beans.factory.annotation.Autowired;

public class RewardWorker {
    @Autowired
    RewardDao positionDao;
    public Reward addReward(Reward reward){
        reward = positionDao.addReward(reward);
        System.out.println(reward);
        return reward;
    }
}
