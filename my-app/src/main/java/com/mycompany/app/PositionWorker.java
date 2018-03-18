package com.mycompany.app;

import com.mycompany.app.dao.interfaces.PositionDao;
import com.mycompany.app.entities.Position;
import org.springframework.beans.factory.annotation.Autowired;

public class PositionWorker {
    @Autowired
    PositionDao positionDao;
    public Position addPosition(Position position){
        position = positionDao.addPosition(position);
        System.out.println(position);
        return position;
    }
}
