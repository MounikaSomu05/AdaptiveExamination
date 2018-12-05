package com.adaptive.manager;



import com.adaptive.dao.OneTimePasswordDao;
import com.adaptive.dao.QuestionDao;
import com.adaptive.dao.TestDetailDao;
import com.adaptive.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.adaptive.entities.*;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Component;


/**
 *
 * @author mounika,hari
 */

@Component
public class StudentManager {
    
    @Autowired
	private StudentService studentService;
	
	@Autowired
	private OneTimePasswordDao oneTimePasswordDao;
	
	@Autowired
	private QuestionDao questionDao;
	
	@Autowired
	private TestDetailDao testDetailDao;
	
	
	
     public Student submitInformation( Student student) throws Exception {
		 Student stu =  studentService.submitInformation(student);
                 System.setProperty("studentId", stu.getStudentId().toString());
		 return stu;
	 }

     public String submitOTP( Student student) throws Exception {
		Student stu = studentService.findById(student.getStudentId());
		       Date otpTime = stu.getOneTimePassword().getCreatedTime();
		if(stu.getOneTimePassword().getOneTimePassword().intValue() == student.getOneTimePassword().getOneTimePassword() 
				&& (getDateDifferenceInHours(otpTime) < 20))
		{
			return "success";
		}
		else
		{
			throw new Exception("OTP is not valid");
		}
	 }
	 
	 private long getDateDifferenceInHours(Date otpTime) {
		 long duration  = new Date().getTime() - otpTime.getTime();
		 return TimeUnit.MILLISECONDS.toMinutes(duration);
	}

     public List<Question> getTestPaper( String choice) throws Exception {
		 return questionDao.getQuestionByTestCategory(TestType.map.get(choice));
	 }
	 
     public TestDetail submitTest(TestDetail test) throws Exception {
                String id = System.getProperty("studentId");
                test.setStudent(studentService.findById(Integer.valueOf(id)));
		double marks = checkTest(test);
		test.setMarks(marks);
		return testDetailDao.save(test);
	 }
     
      public TestDetail submitTestSpelling(TestDetail test) throws Exception {
                String id = System.getProperty("studentId");
                test.setStudent(studentService.findById(Integer.valueOf(id)));
		double marks = checkTest(test);
		test.setMarks(marks);
		return testDetailDao.save(test);
	 }

	private double checkTest(TestDetail test) {
		double marks = 0; 
		List<Question> list = test.getQuestionWithAnswer();
		for(Question question : list)
		{
			String answer = question.getAnswer();
			String selectedAnswer = question.getSelectedOption();
			if(answer.equalsIgnoreCase(selectedAnswer))
			{
				marks++;
			}
		}
		return marks;
	}
        
       
	
     public Student saveInformation(Student student) throws Exception {
		 Student stu =  studentService.addStudent(student);
		 return stu;
	 }
     
       public TestDetail submitWritingTest(TestDetail test) throws Exception {
                String id = System.getProperty("studentId");
                test.setStudent(studentService.findById(Integer.valueOf(id)));
//		double marks = checkTest(test);
//		test.setMarks(marks);
		return testDetailDao.save(test);
	 }
     
}
