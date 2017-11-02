package org.ap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Traingle triangle = new Traingle(); ===> replaced by Spring through code below		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		// Application Context --> similar to BeanFactory
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");		
		Triangle2 triangle2 = (Triangle2) factory.getBean("triangle2");
		triangle2.draw();
	

	}

}
