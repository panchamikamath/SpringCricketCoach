package kamath.panchami.springone;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = new String[3];
		fortunes[0]="Today is your lucky day!";
		fortunes[1]="Need more practice!";
		fortunes[2]="Tomorrow is your lucky day!";
		Random random = new Random();
	    int num =random.nextInt(3);
		return fortunes[num];
	}

}
