package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Trial2 {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("content.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Student student=(Student)factory.getBean("studentbean1");
		student.displayInfo();
	}

}
