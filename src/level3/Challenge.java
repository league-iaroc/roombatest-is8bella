package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(500,500);
	sleep(2500);
	driveDirect(-250,250);
	sleep(500);
	driveDirect(500,500);
	sleep(2500);
	driveDirect(250,-250);
	sleep(500);
	driveDirect(500,500);
	sleep(2500);
	driveDirect(-250,250);
	sleep(500);
	driveDirect(500,500);
	sleep(1800);
	driveDirect(250,-250);
	sleep(500);
	driveDirect(500,500);
	sleep(1500);
	
	}

	public void loop() {
	
	}
}
