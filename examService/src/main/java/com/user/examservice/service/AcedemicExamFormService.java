package com.user.examservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.examservice.model.AcedemicExamForm;
import com.user.examservice.repository.AcedemicExamFormRepo;

@Service
public class AcedemicExamFormService {
	
	@Autowired AcedemicExamFormRepo acedemicExamFormRepo;
	
	public AcedemicExamForm getExamform(String studentid) {
		return acedemicExamFormRepo.getByStudentid(studentid);
	}
	
	public AcedemicExamForm saveExamform(AcedemicExamForm examform) {
		return (AcedemicExamForm) acedemicExamFormRepo.save(examform);
	}
}
