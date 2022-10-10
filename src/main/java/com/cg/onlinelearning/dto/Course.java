package com.cg.onlinelearning.dto;

import java.util.List;

public class Course {

	private Integer courseId;
	private String courseSubject;
	private String courseTopic;
	
	
	private List<Student> student;
	
	

	public Course() {
		super();
	}

	public Course(Integer courseId, String courseSubject, String courseTopic, List<Student> student) {
		super();
		this.courseId = courseId;
		this.courseSubject = courseSubject;
		this.courseTopic = courseTopic;
		this.student = student;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(String courseSubject) {
		this.courseSubject = courseSubject;
	}

	public String getCourseTopic() {
		return courseTopic;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public void setCourseTopic(String courseTopic) {
		this.courseTopic = courseTopic;
	}


}