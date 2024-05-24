package spring.ioc.two;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component

public class banana implements Fruit{
	public void eat() {
		System.out.println("eat banana");
	}

}
