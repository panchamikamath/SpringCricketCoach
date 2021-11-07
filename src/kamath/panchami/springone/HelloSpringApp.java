package kamath.panchami.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theTCoach = context.getBean("myTCoach", Coach.class);
		Coach theBBCoach = context.getBean("myBBCoach", Coach.class);
		
		//call methods on bean
		System.out.println(theTCoach.getDailyWorkout());
		System.out.println(theBBCoach.getDailyWorkout());
		
		//call new methods for fortunes
		System.out.println(theTCoach.getDailyFortune());
		System.out.println(theBBCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
