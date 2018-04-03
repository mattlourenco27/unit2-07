/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This program tests the vehicle subclasses
 *
 ****************************************************************************/

public class Main {
	
	public static void main(String[] args) throws Exception {
		//Instantiate two vehicles and test them
		
		System.out.println("Bike");
		Bike bike = new Bike(Bike.Colours.RED);
		System.out.println(bike.getStatus());
		bike.setCadence(5);
		System.out.println(bike.getStatus());
		bike.setGear(4);
		System.out.println(bike.getStatus());
		bike.brake();
		System.out.println(bike.getStatus());
		
		System.out.println("\nTruck");
		Truck truck = new Truck("BBBB445", Truck.Colours.WHITE);
		System.out.println(truck.getStatus());
		truck.setLicensePlate("JAVAWNS");
		System.out.println(truck.getStatus());
		truck.accelerate(199);
		System.out.println(truck.getStatus());
	}
}