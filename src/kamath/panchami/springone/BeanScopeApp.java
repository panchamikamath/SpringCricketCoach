package kamath.panchami.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-Scope-applicationContext.xml");
		
		//retireve bean from spring container
		Coach theCoach = context.getBean("myTCoach",Coach.class);
		Coach alphaCoach = context.getBean("myTCoach",Coach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		System.out.println("Poining to same object: " + result);
		System.out.println("Memorylocation for theCoach: " + theCoach);
		System.out.println("Memorylocation for alphaCoach: " + alphaCoach);
		
		//close context
		context.close();
	}

}
