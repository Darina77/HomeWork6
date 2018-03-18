package com.mycompany.app;

import com.mycompany.app.dao.interfaces.GroupDao;
import com.mycompany.app.entities.Group;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupsWorker {
    @Autowired
    GroupDao lecturesDao;
    public Group addGroup(Group group){
        group = lecturesDao.addGroup(group);
        System.out.println(group);
        return group;
    }
}
