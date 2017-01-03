

public class Car extends Vehicle {
	// for extending the feature of vehicle we use extends keyword
	String model;
	String launchDate;
	
	public void showCar(){
		System.out.println("Model is " + model);
		
	}
	public void launchDate(){
		System.out.println("Launch date is "+ launchDate);
	}
 
}
