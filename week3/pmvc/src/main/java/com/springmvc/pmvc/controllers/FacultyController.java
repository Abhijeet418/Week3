package com.springmvc.pmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.pmvc.beans.Course;
import com.springmvc.pmvc.beans.Faculty;
import com.springmvc.pmvc.dao.FacultyDao;

/**
 * 
 */
@Controller
public class FacultyController {
	@Autowired
	FacultyDao fdao;
	
	@GetMapping("/home")
	public String viewHome(Model m,@ModelAttribute("f") Faculty f) {
		List<Course> courses = fdao.getCourses(f);
		m.addAttribute("course_list",courses);
		return "home";
		
	}
	
	@PostMapping("/login")
	public String loginFaculty(@ModelAttribute("id") int f_id, @ModelAttribute("pass") String pass) {
		List<Faculty> facultySet = fdao.getFaculties();
		for (Faculty fac: facultySet) {
			if (f_id == fac.getF_id()) {
				if (pass.equals(fac.getPass())) {
					System.out.println("Logged in!");
					return "redirect:home";
				}
			}
		}
		System.out.println("Invalid Details!");
		return "login";
	}
	
}
