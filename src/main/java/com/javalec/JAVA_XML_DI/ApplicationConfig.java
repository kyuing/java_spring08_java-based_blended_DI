package com.javalec.JAVA_XML_DI;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

//inside Applicationconfig.java, xml is NOT imported first. no matter which one is annotated first. java config file will always be first
@ImportResource("classpath:applicationCTX.xml")
@Configurable

public class ApplicationConfig {
	
	@Bean
	public Student javaStudent() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		
		Student student = new Student("Kyu", 20, hobbies);
			
			hobbies.add("JAVA Programming");
			hobbies.add("Sleeping");
		
		student.setHeight(177);
		student.setWeight(77);
		
		return student;
		
	}

}
