package esercizi;

public class BicycleDemo {
	
	public static void main(String[] args) {
		
		//exercise 1
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.changeCadence(1);
		bike1.speedUp(1);
		bike1.changeGear(1);
		
		System.out.println("Exercise 1:\n");
		
		bike1.printStates(0);
		
		System.out.println("\n---\n");
		
		bike2.changeCadence(2); 
		bike2.speedUp(2);
		bike2.changeGear(2);
		
		bike2.printStates(0);
		
		
		
		//exercise 2
		bike1.changeCadence(3);
		bike1.speedUp(10);
		
		bike2.applyBreaks(2);
		
		System.out.println("\nExercise 2:\n");
		
		bike1.printStates(0);
		
		System.out.println("\n---\n");
		
		bike2.printStates(0);
		
		
		
		//Exercise 3
		for(int i = 0; i < 10; i++) {
			
			Bicycle bikeFor = new Bicycle();
			
			bikeFor.changeCadence(10 * i);
			bikeFor.speedUp(5 * i);
			
			bikeFor.printStates(i);
			System.out.println("\n");

		}
	}
	
}
