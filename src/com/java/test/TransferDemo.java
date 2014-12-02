package com.java.test;

import com.java.common.JaxbUtils;
import com.java.common.ResourceUtils;
import com.java.pojo.School;


public class TransferDemo {

	public static void main(String[] args) throws Exception {
		String xml = ResourceUtils.getResourceContent("school.xml");
		School school = JaxbUtils.convertToObject(xml, School.class);
		System.out.println(school.getGrade().get(0).getClazz().get(0).getTeacher());
	}
}
