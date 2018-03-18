package com.mycompany.app.dao.interfaces;
import com.mycompany.app.entities.Reward;

public interface RewardDao {
    Reward addReward(Reward lecture);
    Reward getReward(int id);
    void saveReward(Reward lecture);
}
