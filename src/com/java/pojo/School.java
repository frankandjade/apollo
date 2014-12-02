package com.java.pojo;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "school")
public class School implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1597186058952253631L;
	private List<Grade> grade;

	public List<Grade> getGrade() {
		return grade;
	}

	public void setGrade(List<Grade> grade) {
		this.grade = grade;
	}
	
	
}
