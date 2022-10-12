package com.cg.onlinelearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinelearning.dto.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
