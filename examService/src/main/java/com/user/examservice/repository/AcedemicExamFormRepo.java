package com.user.examservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.examservice.model.AcedemicExamForm;

public interface AcedemicExamFormRepo extends JpaRepository<AcedemicExamForm, Long> {
	
	public AcedemicExamForm getByStudentid(String studentid);
	
}
