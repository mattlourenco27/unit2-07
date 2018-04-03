/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This class is a blueprint for a vehicle
 *
 ****************************************************************************/

public class Vehicle {
	
	protected class InvalidLicensePlateException extends Exception {

		//Default serialVersionUID provided by Eclipse IDE
		private static final long serialVersionUID = 1L;

		public InvalidLicensePlateException() {
	    	  //Default constructor
	    }

	    public InvalidLicensePlateException(String message) {
	    	//exception that displays a message
	        super(message);
	    }
	}
	
	protected enum Colours {
		WHITE,
		GREY,
		BLACK,
		RED,
		ORANGE,
		YELLOW,
		GREEN,
		BLUE,
		PURPLE
	}
	
	protected String licensePlate;
	private final String licenseFormat = "[A-Z0-9]*";
	protected Colours colour;
	protected int numberOfDoors = 4;
	protected int numberOfWheels = 4;
	protected int speed = 0;    			// km/h
	protected int maxSpeed = 200; 	// km/h
	
	public Vehicle() throws Exception {
		//Default Constructor for vehicle class
		this("AAAA111", Colours.GREY);
	}
	
	public Vehicle(String licensePlate, Colours colour) throws Exception {
		//Constructor for vehicle class
		if(licensePlate.matches(licenseFormat) && licensePlate.length() == 7) {
			this.licensePlate = licensePlate;
		} else {
			throw new InvalidLicensePlateException();
		}
		this.colour = colour;
	}
	
	protected String getLicensePlate() { return licensePlate; } //Getter
	
	protected void setLicensePlate(String newPlate) throws Exception {
		//Setter
		if(newPlate.matches(licenseFormat) && newPlate.length() == 7) {
			licensePlate = newPlate;
		} else {
			throw new InvalidLicensePlateException();
		}
	}
	
	protected Colours getColour() { return colour; } //Getter
	
	protected void setColour(Colours newColour) {
		//Setter
		colour = newColour;
		}
	
	protected int getNumberOfDoors() { return numberOfDoors; } //Getter
	
	protected int getNumberOfWheels() { return numberOfWheels; } //Getter
	
	protected int getSpeed() { return speed; } //Getter
	
	protected int getMaxSpeed() { return maxSpeed; } //Getter	
	
	protected void accelerate(int amount) {
		//Allows the vehicle to accelerate an amount
		speed += amount;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
	}
	
	protected void brake(int amount) {
		//Allows the vehicle to brake an amount
		speed -= amount;
		if(speed < 0) {
			speed = 0;
		}
	}
	
	protected String getStatus() {
		//Returns the fields of the class
		return "License plate: " + licensePlate + "\n" + 
				"Colour: " + colour + "\n" +
				"Number of doors: " + numberOfDoors + "\n" +
				"Number of wheels: " + numberOfWheels + "\n" +
				"Speed: " + speed + "km/h\n" +
				"Maximum speed: " + maxSpeed + "km/h";
	}
}