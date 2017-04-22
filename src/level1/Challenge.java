package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		driveDirect(600,600);
		sleep(2000);
		driveDirect(250,500);
		sleep(1600);
		driveDirect(600,600);
		sleep(5200);
		driveDirect(250,500);
		sleep(1400);
		driveDirect(600,600);
		
	}

	public void loop() {
	
	}
}
