package com.mycompany.app.dao.interfaces;

import com.mycompany.app.entities.Group;

public interface GroupDao {
    Group addGroup(Group group);
    Group getGroup(int id);
    void saveGroup(Group group);
}
