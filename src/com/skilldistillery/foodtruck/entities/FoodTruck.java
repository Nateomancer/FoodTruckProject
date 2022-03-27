//Nathan Hafley
//Food Truck

package com.skilldistillery.foodtruck.entities;

public class FoodTruck {

	// Field Variables
	private String foodTruckName;
	private String foodTruckFoodType;
	private double foodTruckRating;
	private int foodTruckID;
	private static int nextFoodTruckID = 1000;

	// ------------------------CONSTRUCTORS----------------------
	// DEFAULT CONTRUCTOR
	// TODO: Default constructor??
	// TODO:DOES IT NEED ANYTHING??

	// DEFAULT CONSTRUCTOR
	public FoodTruck() {
		// super();
	}

	// MAIN CONTRUCTORS
	// OVERLOADED
	// STAYS PUBLIC
	public FoodTruck(String foodTruckName, String foodTruckFoodType, double foodTruckRating) {
		// super();
		this.foodTruckName = foodTruckName;
		this.foodTruckFoodType = foodTruckFoodType;
		this.foodTruckRating = foodTruckRating;
		nextFoodTruckID = nextFoodTruckID + 1;
		this.foodTruckID = nextFoodTruckID;

	}

	// ------------------ METHODS----------------------
	// GETTERS AND SETTERS

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodTruckFoodType() {
		return foodTruckFoodType;
	}

	public void setFoodTruckFoodType(String foodTruckFoodType) {
		this.foodTruckFoodType = foodTruckFoodType;
	}

	public double getFoodTruckRating() {
		return foodTruckRating;
	}

	public void setFoodTruckRating(double foodTruckRating) {
		this.foodTruckRating = foodTruckRating;
	}

	// ----------------TOSTRINGS----------------

	// TODO: Create TOSTRING
	// TO STRING
	// OUTPUT INFO ON FOOD TRUCK OBJECT
	public String toString() {
		return "Food Truck: " + foodTruckName + ", Food Type: " + foodTruckFoodType + ", Food Truck Rating: "
				+ foodTruckRating + " Food Truck ID " + foodTruckID;
	}

	public void displayFoodTrucks() {
		String foodTruckData = toString();
		System.out.println(foodTruckData);
		System.out.println("");
	}

}
