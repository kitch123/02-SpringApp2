package com.rktech;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rktech.spring.beans.Welcome;
import com.rktech.spring.beans.Demo;

public class App {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("com/rktech/spring/config/spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Welcome welcomeBean = (Welcome) beanFactory.getBean("wb");
//    	
		Demo demoBean = (Demo) beanFactory.getBean("db");
//    	
		System.out.println(welcomeBean);
		System.out.println(demoBean);
//    	

	}
}
