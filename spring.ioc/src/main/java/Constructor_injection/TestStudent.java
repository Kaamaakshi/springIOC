package Constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		//Student s=new Student(1, "yamini");
//		System.out.println(s);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("constructorijection.xml");
		Student student1=(Student) context.getBean("std1");
		System.out.println(student1);
		
		Student student2=(Student) context.getBean("std2");
		System.out.println(student2);
		
	}

}
