package com.cdgi.it.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdgi.it.pojo.Student;

@RestController
public class StudentRestController {
	@RequestMapping(value = "/student/insert", method = RequestMethod.POST)
	public void createStudent(@RequestBody Student student, @RequestParam("rollNo") int rollNo, @RequestParam("email") String email) {
		System.out.println(student);
		System.out.println(email);
		System.out.println(rollNo);
	}

}
