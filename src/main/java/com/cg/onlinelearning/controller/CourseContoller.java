package com.cg.onlinelearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinelearning.dto.Course;
import com.cg.onlinelearning.service.CourseService;

@RestController
public class CourseContoller {

	@Autowired
	CourseService courseService;
	
	
	@PostMapping("/add")
	public ResponseEntity< Course> save(@RequestBody Course course){
		
		return new ResponseEntity<>(courseService.add(course),HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity< List<Course>> get(){
		
		return new ResponseEntity<>(courseService.showAllCourses(),HttpStatus.OK);
	}
	

	@GetMapping("/find/{subject}")
	public ResponseEntity< List<Course>> findBySubject(@PathVariable String subject){
		
		return new ResponseEntity<>(courseService.searchBySubject(subject),HttpStatus.OK);
	}
}
