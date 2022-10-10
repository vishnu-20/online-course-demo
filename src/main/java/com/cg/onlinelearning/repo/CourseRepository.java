package com.cg.onlinelearning.repo;

import java.util.List;

import com.cg.onlinelearning.dto.Course;

public interface CourseRepository {

	
	Course save (Course course);
	List<Course> findBySubject (String courseSubject);
	List<Course> showAllCourses();
}
