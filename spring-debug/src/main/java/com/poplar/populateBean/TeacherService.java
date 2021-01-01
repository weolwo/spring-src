package com.poplar.populateBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create BY poplar ON 2021/1/1
 */
@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;
}
