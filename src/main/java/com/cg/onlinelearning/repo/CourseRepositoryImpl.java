package com.cg.onlinelearning.repo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.cg.onlinelearning.dto.Address;
import com.cg.onlinelearning.dto.Course;
import com.cg.onlinelearning.dto.Student;


@Component
public class CourseRepositoryImpl implements CourseRepository {

	List<Course> courses = new ArrayList<>();

	@Override
	public Course save(Course course) {
		courses.add(course);
		return course;
	}

	@PostConstruct
	public void populateData() {

		List<Student> list = new ArrayList<>();
		
		Address address = new Address("Muvattupuzha", "kerala", 920745);
		
//		Student student = new Student("Vishnu",9207450908L,"vishnuLal@gmail.com",address);
		
//		list.add(student);
		
		
		Course c1 = new Course(1, "English", "story", list);
		Course c2 = new Course(2, "maths", "story", list);
		Course c3 = new Course(3, "sciencce", "story", list);
		
		courses.add(c3);
		courses.add(c1);
		courses.add(c2);
	}

	@Override
	public List<Course> findBySubject(String courseSubject) {

		return !CollectionUtils.isEmpty(courses)
				? courses.stream().filter(val -> val.getCourseSubject().equalsIgnoreCase(courseSubject)).toList()
				: courses;
	}

	@Override
	public List<Course> showAllCourses() {
		
		return courses;
	}

}
