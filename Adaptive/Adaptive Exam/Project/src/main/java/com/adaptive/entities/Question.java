/**
 *
 * @author mounika,hari
 */
package com.adaptive.entities;

import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer questionId;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String selectedOption;
        @Column(name="image", nullable=false, columnDefinition="longblob")
        private byte[] image;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

  
	
	public String getSelectedOption() {
		return selectedOption;
	}

	public void setSelectedOption(String selectedOption) {
		this.selectedOption = selectedOption;
	}

	private String answer;
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	private String category;
	
	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
		
}
