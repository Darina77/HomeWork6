package com.mycompany.app.dao.interfaces;

import com.mycompany.app.entities.SinceWork;

public interface SinceWorkDao {
    SinceWork addSinceWork(SinceWork sinceWork);
    SinceWork getSinceWork(int id);
    void saveSinceWork(SinceWork sinceWork);
}
