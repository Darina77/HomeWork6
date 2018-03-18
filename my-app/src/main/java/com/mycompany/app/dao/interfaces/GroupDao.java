package com.mycompany.app.dao.interfaces;

import com.mycompany.app.entities.Group;

public interface GroupDao {
    Group addGroup(Group lecture);
    Group getGroup(int id);
    void saveGroup(Group lecture);
}
