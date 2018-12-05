/**
 *
 * @author mounika,hari
 */
package com.adaptive.service;

import org.springframework.stereotype.Component;

import com.adaptive.entities.Student;

@Component
public interface StudentService {

	public Student submitInformation(Student student) throws Exception;
	public Student findById(Integer student);
	public Student addStudent(Student student);
}
