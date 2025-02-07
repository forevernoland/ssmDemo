package com.demo.mms.service;

import com.demo.mms.common.domain.course;
import com.demo.mms.dao.courseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class courseServiceImpl implements courseService{
    @Autowired
    courseMapper coursemapper;
    @Transactional
    @Override
    public void addCourse(course course){coursemapper.insertcourse(course);}
    @Transactional
    @Override
    public course findcourse(int course_id){
        return coursemapper.selecourse(course_id);
    }
}

