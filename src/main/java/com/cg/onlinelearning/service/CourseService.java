package com.cg.onlinelearning.service;

import java.util.List;

import com.cg.onlinelearning.dto.Course;
import com.cg.onlinelearning.dto.Student;

public interface CourseService {

	Course registerForCOurse(String courseSubject, Student student);
	Course add(Course course);
	List<Course> searchBySubject(String courseSubject);
	List<Course> showAllCourses();
}
