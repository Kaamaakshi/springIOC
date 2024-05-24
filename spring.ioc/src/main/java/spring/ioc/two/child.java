package spring.ioc.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class child {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		banana b=new banana();
//		b.eat();
//		
//		Mango m=new Mango();
//		m.eat();
		
		@Autowired
		Fruit f;
		void buy() {
			f.eat();
		}
        

	}


