package esercizi;

class Bicycle {
	
	int cadence = 1;
	int speed = 0;
	int gear = 1;
	
	public void changeCadence(int newCadence){
		
		cadence = newCadence;
	
	}
	
	public void speedUp(int increment){
		
		speed += increment;
	
	}
	
	public void applyBreaks(int decrement){
		
		speed -= decrement;
	
	}
	
	public void changeGear(int newGear){
		
		gear = newGear;
	
	}
	
	public void printStates(int increment){
		
		System.out.println("Cadence: " + cadence + "\nSpeed: " + speed + "\nGear: " + gear);
		
	}
}


