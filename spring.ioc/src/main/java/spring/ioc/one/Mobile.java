package spring.ioc.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MusicPlayer musicPlayer=new MusicPlayer();
//		musicPlayer.startmusic();
		
		//loading xml file to spring container
	  ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ac.xml");
	  MusicPlayer musicPlayer=(MusicPlayer) applicationContext.getBean("mp");
	  musicPlayer.startmusic();
	  WhatsApp app=(WhatsApp) applicationContext.getBean("wa");
		app.send();
//		

		
		
		//finding xml file
//		ClassPathResource classPathResource=new ClassPathResource("ac.xml");
//		
//		//loading the xml file
//		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);	
//		MusicPlayer musicPlayer=(MusicPlayer) beanFactory.getBean("mp");
//		musicPlayer.startmusic();
//		
//		WhatsApp app=(WhatsApp) beanFactory.getBean("wa");
//		app.send();
//		
		
		
		

	}

}
