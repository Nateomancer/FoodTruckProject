#FOOD TRUCK

This programs allows users to input a total of 5 Foodtrucks, their names, the type of food that they serve, and a rating they assign. The user can input a max amount of 5 food trucks, but aren't required too.  They user can then use the menu to list each food truck that was entered, see the average rating, or the highest rating.

##DESCRIPTION
Technologies used:
*Mac *Java *Eclipse *ZSH *Git

This program was written in Java in the Eclipse IDE. The finished code was then pushed to a Github respoistory using Git on a Mac ZSH terminal.

The program consists of two classes, FoodTruck and FoodTruckApp.  Only one static method was used, which was the main method in FoodTruckApp.  

FoodTruckAPP:

This class holds the main method. Being that the main method is a static method, a instance of the FoodTruckApp was created, called app, and called in the the main method.  This was so non static references could be made to non static fields and methods in the Food Truck Class.  The Food Truck class is in a different java packed, and required an import statement to use. 

The array trucks was declared as a private field variable and instantiated from the class FoodTrucks, which holds each object truck. The trucks array has a length of 5. A scanner was created so that information can be inputed in the terminal.  As the user inputs data, an object truck is declared, instantiated, and then initialized with the user input data. This is done by iterating through the Trucks array with a for loop and calling the FoodTruck constructor in the Food Truck Class, which instantiates the truck object with the field variables foodTruckName, foodTruckType, and foodTruckRating. When the loop reaches 5, or the user enters Q as the Food Trucks name to quit, a menu is displayed which the users can then use to see every food truck created and it's own fields, such as the name, the average rating of all the food trucks, the highest rated food truck, or the ID of the food truck.  This was done by creating a method, displayMenu, that is called after the loop ends. This method simply displays a menu in the terminal.  The user can chose an input from the menu, which was done by creating a switch statement in the main method.  Depending on the character inputed, a method is called with then performs the desired action, such as listing all the trucks. Each method uses a similar for loop which iterates through the trucks array for each truck and their field variables. If a a NULL object is found, the loop ends, and the information that was pulled is output to the terminal. The Null object and it's fields are not displayed. The is is then returned to the menu, as the displayMenu method is called again. The user can quit from the menu, ending the program, or choose another option. The program continues as the switch statement is in a while loop, which terminates when the user quits.

FoodTruck:

The field variables for the class Food Truck were declared private, so a series of get and set methods were created for each field variable, other than foodTruckID and nextFoodTruckID, which are assigned and incremented in the FoodTruck constructor. The Food Truck constructor is called when a truck is declared, and then instantiates the object with it's fields. At the bottom of the class a toString method is used to display output of all the fields of the truck object. 





##LESSON LEARNED

Learned how to import a package to access an outside class.

Learned how to declare, instantiate, and initialize an array of objects.

Learned how to manage static and non static methods and variables. For example a non static method was created as the static main method couldn't access any fields to set or get data for the truck. Private and public methods and variables were used too. Get and set statements were used so that information can be inputed from the FoodTruckApp class, set in the FoodTruck class, and then retrieved later when called.

Learned how to use constructor and toStrings for objects of a class, and call each object and their fields from a separate class.

Learned to use a assign a non static field variable in a constructor without using it as a parameter, and then incrementing that variable by referencing a nonstatic field variable.

Learned how to iterate through an array of objects, and the loop if a null field is reached. 

Gained more experience with class methods, for loops, while loops, switch statements, and collecting input with the scanner class.


##FoodTruckProject
