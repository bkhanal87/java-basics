package javaBasics;

class Bicycle {
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	void changeCadence(int newValue) {
		cadence = newValue;
	}
	
	void changeGear (int newValue) {
		gear = newValue;
	}
	
	void increaseSpeed(int increment) {
		speed = speed + increment;
	}
	
	void decreaseSpeed(int decrement) {
		speed = speed - decrement;
	}
	
	void printStates() {
		System.out.println("cadence: " + cadence + "speed" + speed + "gear" + gear);
	}
}
