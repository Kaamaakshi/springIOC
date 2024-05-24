package Setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// loading xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("Setterinjection.xml");
		Employee employee = (Employee) context.getBean("emp");

//		Employee employee1=(Employee) context.getBean("e");		
//		System.out.println(employee==employee1);

		System.out.println(employee);

	}

}
