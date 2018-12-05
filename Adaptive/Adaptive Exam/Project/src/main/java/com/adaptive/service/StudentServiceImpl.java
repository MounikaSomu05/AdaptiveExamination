/**
 *
 * @author mounika,hari
 */
package com.adaptive.service;

import java.util.Date;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaptive.dao.OneTimePasswordDao;
import com.adaptive.dao.StudentDao;
import com.adaptive.entities.OneTimePassword;
import com.adaptive.entities.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	@Autowired
	private OneTimePasswordDao oneTimePasswordDao;
	
	@Transactional
	public Student submitInformation(Student student) throws Exception {
		 Student stu = studentDao.findOne(student.getStudentId());
		 if(stu == null)
		 {
			 throw new Exception("Student Not Registered");
		 }else
		 {
			 int number  = generateOneTimePassword();
			 OneTimePassword oneTimePassword = stu.getOneTimePassword();
			 if(oneTimePassword == null) oneTimePassword = new OneTimePassword();
			 oneTimePassword.setOneTimePassword(number);
			 oneTimePassword.setCreatedTime(new Date());
			 oneTimePassword.setStudent(stu);
			 oneTimePassword  = oneTimePasswordDao.save(oneTimePassword);
			 stu.setOneTimePassword(oneTimePassword);
			 stu = studentDao.save(stu);
		 }
		return stu;
	}

	public Student findById(Integer student) {
		return studentDao.findOne(student);
	}

	private int generateOneTimePassword() {
		Random r = new Random( System.currentTimeMillis() );
	    return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000)); 
	}

	public Student addStudent(Student student) {
		return studentDao.save(student);
	}
}
