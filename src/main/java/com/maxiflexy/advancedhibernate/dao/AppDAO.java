package com.maxiflexy.advancedhibernate.dao;

import com.maxiflexy.advancedhibernate.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);
}
