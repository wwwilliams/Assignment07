/* Westley W Williams
 *  CIS 2212-800 Java I FlexPace
 *  Assignment 07 - OBJECTS AND CLASSES
 *  Started January 28th, 2021
 */

package chap9;

import java.util.Scanner;

//this class has the main method inside
//Driver Population class
public class DriverPopulation {

	// main method
	public static void main(String[] args) {
		Population objectUnitedStates = new Population();// create a new object for the United States
		// "United States" as an argument is going to activate the constructor that
		// requires this argument
		Scanner mainScanner = new Scanner(System.in);
		// the assignment called for not hardcoding "USA" in the driver program, so
		// I ask for the input and put that input (string) into the setNameOfCountry
		// setter.
		System.out.println("Enter first country name (to prevent hardcoding, per the assignment): ");
		String userInput = mainScanner.nextLine();
		// set the name of the country with the user input
		objectUnitedStates.setNameOfCountry(userInput);
		objectUnitedStates.getUserInput();// I used this method to clean up the main function. It simply gets the user
		// input like number of males, females, square miles and number of states in
		// the U.S. object
		// the above method, getUserInput, will also initialize the data fields for our
		// United States object, since we didn't use the constructor for that.

		// print the object. Inside the class Population, the toPrint method is
		// overridden to display the required fields of country name, total population,
		// population per square mile, and population per state
		System.out.println(objectUnitedStates);

		// create the object for Germany's population. The constructor initializes the
		// data fields in this case
		Population objectGermany = new Population("Germany");
		// Just like above, we print the data fields of this object per the assignment
		// requirements
		System.out.println(objectGermany);

		// create an object for Argentina's population. The constructor also initializes
		// the data fields.
		Population objectArgentina = new Population("Argentina");
		// print the instance object, objectArgentina
		System.out.println(objectArgentina);
	}
}
