package com.christophe.marchal.classpathscanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.christophe.marchal.classpathscanner.metadata.MetadataIndex;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-classpathscanner-beans.xml");
		
		MetadataIndex metadata = (MetadataIndex) ac.getBean("metadataIndex");
		System.out.println(metadata);
	}
}
