package com.user.examservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.examservice.model.AcedemicExamForm;
import com.user.examservice.service.AcedemicExamFormService;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1")
public class ExamformController {
	
	@Autowired AcedemicExamFormService acedemicExamFormService;
	
	@GetMapping("/getexamform/{studentid}")
	public AcedemicExamForm getExamform(String studentid) {
		return acedemicExamFormService.getExamform(studentid);
	}
	
	@PostMapping("/examform/save")
	public AcedemicExamForm saveExamform(@RequestBody AcedemicExamForm examform) {
		return acedemicExamFormService.saveExamform(examform);
	}
	
}
