package com.java.pojo;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "grade")
public class Grade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8857964170034700029L;
	
	private int gradeId;
	private String name;
	private List<Clazz> clazz;
	
	public int getGradeId() {
		return gradeId;
	}
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Clazz> getClazz() {
		return clazz;
	}
	public void setClazz(List<Clazz> clazz) {
		this.clazz = clazz;
	}
	
	
}
