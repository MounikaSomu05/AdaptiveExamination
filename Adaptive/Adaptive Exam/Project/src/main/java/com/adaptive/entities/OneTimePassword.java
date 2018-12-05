/**
 *
 * @author mounika,hari
 */
package com.adaptive.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "onetimepassword")
public class OneTimePassword {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studentId;
	
	@JsonIgnore
	@OneToOne@NotNull
	@JoinColumn(name = "s_id")
	@Basic(fetch = FetchType.LAZY)
	private Student student;

	private Integer oneTimePassword;
	
	private Date createdTime;
	
	
	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getOneTimePassword() {
		return oneTimePassword;
	}

	public void setOneTimePassword(Integer oneTimePassword) {
		this.oneTimePassword = oneTimePassword;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
