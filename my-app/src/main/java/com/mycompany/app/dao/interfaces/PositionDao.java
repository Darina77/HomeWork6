package com.mycompany.app.dao.interfaces;

import com.mycompany.app.entities.Position;

public interface PositionDao {
    Position addPosition(Position position);
    Position getPosition(int id);
    void savePosition(Position position);
}
