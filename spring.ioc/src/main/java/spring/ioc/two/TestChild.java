package spring.ioc.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestChild {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Myconfig.class);
		child c=context.getBean(child.class);
		c.buy();
	
	}

}
