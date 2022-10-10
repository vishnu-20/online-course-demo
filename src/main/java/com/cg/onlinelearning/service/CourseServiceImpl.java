package com.cg.onlinelearning.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinelearning.dto.Course;
import com.cg.onlinelearning.dto.Student;
import com.cg.onlinelearning.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseRepository courseRepository;

	@Override
	public Course registerForCOurse(String courseSubject, Student student) {
		List< Student > list = new ArrayList<>();
		list.add(student);
		Course course = new Course(2, courseSubject, null, list);
		return courseRepository.save(course);
	}

	@Override
	public Course add(Course course) {
		
		return courseRepository.save(course);
	}

	@Override
	public List<Course> searchBySubject(String courseSubject) {

		return courseRepository.findBySubject(courseSubject);
	}

	@Override
	public List<Course> showAllCourses() {
		
		return courseRepository.showAllCourses();
	}

	
	
}
