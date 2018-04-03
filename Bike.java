/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This class is a blueprint for a bike that extends a vehicle
 *
 ****************************************************************************/

public class Bike extends Vehicle {
	
	protected int cadence = 0;
	protected int gear = 1;
	protected int maxGear = 6;
	
	public Bike() throws Exception {
		//Default constructor
		this(Colours.GREY);
	}
	
	public Bike(Colours colour) throws Exception {
		//Constructor override
		super("AAAA111", colour);
		numberOfDoors = 0;
		numberOfWheels = 2;
		maxSpeed = 50;
		licensePlate = null;
	}
	
	protected void setLicensePlate(String newPlate) { }
	
	protected int getCadence() { return cadence; } //Getter
	
	protected void setCadence(int newCadence) {
		//Setter
		cadence = newCadence;
		if (cadence >= 0) {
			speed = cadence * gear;
			if (speed > maxSpeed) {
				speed = maxSpeed;
			}
		} else {
			speed = 0;
		}
	}
	
	protected int getGear() { return gear; } //Getter
	
	protected void setGear(int newGear) {
		if (newGear < 0) {
			gear = 0;
		} else if (newGear > maxGear) {
			gear = maxGear;
		} else {
			gear = newGear;
		}
		
		speed = cadence * gear;
		if (speed > maxSpeed) {
			speed = maxSpeed;
		}
	}
	
	protected int getMaxGear() { return maxGear; } //Getter
	
	protected void accelerate(int amount) { }
	
	protected void brake(int amount) { }
	
	protected void brake() {
		//Allows the bike to stop
		cadence = 0;
		speed = 0;
	}
	
	protected String getStatus() {
		//Returns the relevant fields of the class
		return "Colour: " + colour + "\n" +
				"Cadence: " + cadence + "\n" +
				"Gear: " + gear + "\n" +
				"Speed: " + speed + "km/h\n";
	}
}