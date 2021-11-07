package kamath.panchami.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleApp {

	public static void main(String[] args) {
		//load spring configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
				
				//retireve bean from spring container
				Coach theCoach = context.getBean("myTCoach",Coach.class);
				
				System.out.println("Memorylocation for theCoach: " + theCoach);
				
				//close context
				context.close();

	}

}
