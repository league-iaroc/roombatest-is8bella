package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(700,700);
		sleep(1700);
		driveDirect(300,600);
		sleep(750);
		driveDirect(700,700);
		sleep(3000);
		driveDirect(600,300);
		sleep(750);
		driveDirect(700,700);
	}

	public void loop() {
	
	}
}
