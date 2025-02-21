package com.springmvc.pmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvc.pmvc.beans.Course;
import com.springmvc.pmvc.dao.CourseDao;

/**
 * 
 */
@Controller
public class CourseController {
	@Autowired
	CourseDao cdao;
	
	@GetMapping("/courses")
	public String showCourses(Model m){    
        List<Course> list=cdao.getCourseList();    
        m.addAttribute("list",list);
        return "courses";	
    }
	
}

