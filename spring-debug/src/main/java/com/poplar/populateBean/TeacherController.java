package com.poplar.populateBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Create BY poplar ON 2021/1/1
 */
@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
}
