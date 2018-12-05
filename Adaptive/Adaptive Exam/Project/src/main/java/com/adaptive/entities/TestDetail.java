/**
 *
 * @author mounika,hari
 */
package com.adaptive.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "testdetail")
public class TestDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer testId;
	
	@OneToOne
	@JoinColumn(name = "student_id")
	@Basic(fetch = FetchType.LAZY)
	private Student student;
	
	private String category;
	
	private Double marks;
	
	private String minutes;
	
	private String second;
        
        @Column(name = "test_date")
        private Date testDate;

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }
	
	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	@Transient
	private List<Question> questionWithAnswer;

	public List<Question> getQuestionWithAnswer() {
		return questionWithAnswer;
	}

	public void setQuestionWithAnswer(List<Question> questionWithAnswer) {
		this.questionWithAnswer = questionWithAnswer;
	}

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
	
	
}
