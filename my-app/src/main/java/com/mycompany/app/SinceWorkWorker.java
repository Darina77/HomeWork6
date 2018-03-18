package com.mycompany.app;

import com.mycompany.app.dao.interfaces.SinceWorkDao;
import com.mycompany.app.entities.SinceWork;
import org.springframework.beans.factory.annotation.Autowired;

public class SinceWorkWorker
{
    @Autowired
    SinceWorkDao sinceWorkDao;
    public SinceWork addSinceWork(SinceWork sinceWork){
        sinceWork = sinceWorkDao.addSinceWork(sinceWork);
        System.out.println(sinceWork);
        return sinceWork;
    }
}
