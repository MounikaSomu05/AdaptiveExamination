/**
 *
 * @author mounika,hari
 */
package com.adaptive.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;


@Entity
@Table(name="student")
public class Student implements Serializable{

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studentId;
		
	private String name;
	private String schoolName;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "s_id")
	private OneTimePassword oneTimePassword;
	
	
	public OneTimePassword getOneTimePassword() {
		return oneTimePassword;
	}
	public void setOneTimePassword(OneTimePassword oneTimePassword) {
		this.oneTimePassword = oneTimePassword;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
}
