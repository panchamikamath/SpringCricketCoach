package kamath.panchami.springone;

public class TrackCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
		
	public TrackCoach() {
	}
	
	//define constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
		
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		//use my fortueService to get a fortune
		return "Just do it! " +fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}
}
