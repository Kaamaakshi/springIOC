package has_a_relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("hasarelationship.xml");
		Car car=(Car) applicationContext.getBean("car");
		car.getEngine().start();

	}

}
