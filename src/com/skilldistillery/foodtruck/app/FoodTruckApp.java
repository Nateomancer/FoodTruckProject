//Nathan Hafley
//Food Truck

package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;
import java.util.Scanner;

public class FoodTruckApp {

	// make array of objects
	private FoodTruck[] trucks = new FoodTruck[5];
	// The array is called trucks
	// Food truck is the object
	// Trucks is the array with 5 slots

	/// ---------Main Method------------
	public static void main(String[] args) {

		// Make scanner
		java.util.Scanner input = new Scanner(System.in);

		// Created an instance of this class
		// Makes non static reference
		FoodTruckApp app = new FoodTruckApp();
		app.run();

		// Keeps program running
		// terminates when user quits
		boolean runMenu = true;
		while (runMenu == true) {
			// prints menu
			app.printMenu();
			System.out.println("Please enter A, B, C, or Q");
			char menuSelection = input.next().toUpperCase().charAt(0);

			// Switch to control menu input
			switch (menuSelection) {

			case 'A':
				app.listFoodTrucks();
				break;
			case 'B':
				app.averageRating();
				break;
			case 'C':
				app.highestRating();
				break;
			case 'Q':
				System.out.println("Goodbye");
				input.close();
				runMenu = false;
				break;
			default:
				System.out.println("Invalid Option");

			}

		}

	}

//Methods
//Used to access non static refrences 
	private void run() {

		// create scanner
		java.util.Scanner input = new Scanner(System.in);

		// FOR LOOP THAT COLLECTS USER INPUT
		// iterates for each spot in the array
		for (int i = 0; i < 5; i++) {

			// Get name of food truck from user
			System.out.println("Please Enter Name of Food Truck, or Enter Q to quit.");
			String name = input.nextLine();

			// Quits the program
			if (name.toUpperCase().equals("Q")) {
				input.close();
				break;
			} else {

				// Get type of food truck from user
				System.out.println("Please Enter Type of Food Truck.");
				String foodType = input.nextLine();
				// trucks[numFoodTrucks].setFoodTruckFoodType(input.nextLine());

				// get user rating for for truck
				System.out.println("Please Enter Rating for Food Truck.");
				double rating = input.nextDouble();
				input.nextLine();

				// Call constructor to assign fields to truck
				FoodTruck truck = new FoodTruck(name, foodType, rating);

				// assign truck to location in trucks array
				trucks[i] = truck;
				// truck is the name of the object
				// food truck is the datatype/object type
				// trucks is the array

			}
		}

	}

	// --------DISPLAY MENU--------

	private void printMenu() {

		System.out.println();
		System.out.println("============== MENU =============");
		System.out.println("|                               |");
		System.out.println("|  Enter A List FoodTrucks      |");
		System.out.println("|  Enter B List Average Rating  |");
		System.out.println("|  Enter C List Highest Rating  |");
		System.out.println("|  Enter Q Exit                 |");
		System.out.println("|                               |");
		System.out.println("=================================");
		System.out.println();

	}

	// ----------DISPLAY FOOD TRUCKS----------

	private void listFoodTrucks() {
		System.out.println("--------------------");
		System.out.println("---DISPLAY TRUCKS---");
		System.out.println("--------------------");

		// loop to search Trucks array
		// outputs Trucks with toString
		for (int i = 0; i < 5; i++) {

			// terminates if loop reaches Trucks array with null value
			if (trucks[i] == null) {
				break;

			} else {
				trucks[i].displayFoodTrucks();
			}
		}
		System.out.println("");
	}

	// -------------find averageRating----------
	private void averageRating() {
		double rating;
		double totalRating = 0;
		double averageRating = 0;
		int counter = 0;
		System.out.println("--------------------");
		System.out.println("---AVERAGE RATING---");
		System.out.println("--------------------");

		// loop to search Trucks array
		// finds average
		for (int i = 0; i < 5; i++) {

			// terminates is loop reaches Trucks array with null value
			if (trucks[i] == null) {
				break;
			} else {

				rating = trucks[i].getFoodTruckRating();
				totalRating = totalRating + rating;
				counter++;

			}
		}
		averageRating = totalRating / counter;
		System.out.println("Average Rating: " + averageRating);
		System.out.println("");

	}

	// -------------find highestRating---------
	private void highestRating() {
		double highestRating = 0;
		double currentRating = 0;
		double newRating = 0;
		String bestTruck = new String();
		System.out.println("---------------------");
		System.out.println("---BEST FOOD TRUCK---");
		System.out.println("---------------------");
		for (int i = 0; i < 5; i++) {

			if (trucks[i] == null) {
				break;
			} else {

				newRating = trucks[i].getFoodTruckRating();

				if (currentRating < newRating) {
					currentRating = newRating;
					bestTruck = trucks[i].toString();
				}

			}
		}
		highestRating = currentRating;
		System.out.println("Best Truck Award Goes to:");
		System.out.println(bestTruck);
		System.out.println("");

	}

}
