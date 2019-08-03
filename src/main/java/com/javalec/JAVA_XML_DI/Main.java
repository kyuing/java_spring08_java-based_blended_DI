package com.javalec.JAVA_XML_DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;	//import annotation
import com.javalec.JAVA_XML_DI.ApplicationConfig;
import com.javalec.JAVA_XML_DI.Student;

public class Main {

	public static void main(String[] args) {

		/* xml + java DI (xml-based)
		   We can use both xml and java file at the same time by deciding the base container you want between xml and java. 
		 * Here, xml file is included in the java file. */
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);	//container

		
		//student1 (java resource): ApplicationConfig.java -> Student.java
		Student student1 = ctx.getBean("javaStudent", Student.class);	
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Hobbies: " + student1.getHobbies());
		System.out.println("Height: " + student1.getHeight());
		System.out.println("Weight: " + student1.getWeight());
		System.out.println();
		
		//student2 (xml resource): ApplicationConfig.java -> ApplicationCTX.xml -> Student.java
		Student student2 = ctx.getBean("xmlStudent", Student.class);
		System.out.println("Name: " + student2.getName());
		System.out.println("Age: " + student2.getAge());
		System.out.println("Hobbies: " + student2.getHobbies());
		System.out.println("Height: " + student2.getHeight());
		System.out.println("Weight: " + student2.getWeight());
		System.out.println();
		
		ctx.close();

	}

}
