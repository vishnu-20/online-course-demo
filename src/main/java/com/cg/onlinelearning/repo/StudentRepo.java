package com.cg.onlinelearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinelearning.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
