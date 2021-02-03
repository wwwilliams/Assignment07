package chap9;

import java.util.Scanner;

//introduction of a new class. This class must not be public as we already have a public class in this file.
//this class does not have a main method inside. The main method is in the class DriverPopulation (above).
public class Population {
	// declare these data fields as private, as we don't want people outside of this
	// class interfering with these fields
	// When we do change these fields, we will do so through the setter methods
	// below
	// if we want to access these fields, we will access them through the getter
	// methods
	private String nameOfCountry;// Country name
	private int numberOfMales;// Number of males in the country
	private int numberOfFemales;// Number of females in the country
	private double numberOfSquareMiles;// Number of square miles in the country
	private int numberOfStates;// Total number of states within the country

	public Population() {

	}

	// constructor one
	// I used an if statement in this constructor. Hopefully that is not a coding
	// fallacy of some sort.
	public Population(String nameOfCountry) {
		if (nameOfCountry == "Argentina") {
			this.nameOfCountry = "Argentina";
			this.numberOfMales = 19768407;
			this.numberOfFemales = 20643969;
			this.numberOfSquareMiles = 1068301.76; // units are miles squared
			this.numberOfStates = 23; // 23 provinces, as opposed to states
		} else if (nameOfCountry == "Germany") {
			this.nameOfCountry = "Germany";
			this.numberOfMales = 40340771; // provided by instructor
			this.numberOfFemales = 41961693; // provided by instructor
			this.numberOfSquareMiles = 137846.52; // units are miles squared
			this.numberOfStates = 16;
		} else if (nameOfCountry == "USA") {
			// this else statement can be used if we decide to enter America as the country
			// but it can also be used if we want to enter another country not listed in our
			// assignment
			this.nameOfCountry = nameOfCountry;
		} else {

		}

	}// end of first constructor. Notice that the constructor has an if/else-if/else
	// statement in it.

	// constructor two
	public Population(String nameOfCountry, int numberOfMales, int numberOfFemales, double numberOfSquareMiles,
			int numberOfStates) {
		this.nameOfCountry = nameOfCountry;
		this.numberOfMales = numberOfMales;
		this.numberOfFemales = numberOfFemales;
		this.numberOfSquareMiles = numberOfSquareMiles;
		this.numberOfStates = numberOfStates;
	}// end of the second constructor. Since we have two constructors, we will not
	// have a default constructor since we already have constructors provided
	// the two constructors above are a great example of constructor overloading.

	// first getter method
	// public method, which means that it can be accessed within any class or any
	// package
	// also, I defined this as an instance method so that I could access the data
	// fields above, which are also instance
	public String getNameOfCountry() {
		return nameOfCountry;
	}

	// first setter method
	// public, instance, and of void type (so that it doesn't return anything).
	public void setNameOfCountry(String nameOfCountry) {
		this.nameOfCountry = nameOfCountry;
	}

	// getter method
	public int getNumberOfMales() {
		return numberOfMales;
	}

	// setter method
	public void setNumberOfMales(int numberOfMales) {
		this.numberOfMales = numberOfMales;
	}

	// getter method
	public int getNumberOfFemales() {
		return numberOfFemales;
	}

	// setter method
	public void setNumberOfFemales(int numberOfFemales) {
		this.numberOfFemales = numberOfFemales;
	}

	// getter method
	public double getNumberOfSquareMiles() {
		return numberOfSquareMiles;
	}

	// setter method
	public void setNumberOfSquareMiles(double numberOfSquareMiles) {
		this.numberOfSquareMiles = numberOfSquareMiles;
	}

	// getter method
	public int getNumberOfStates() {
		return numberOfStates;
	}

	// setter method
	public void setNumberOfStates(int numberOfStates) {
		this.numberOfStates = numberOfStates;
	}

	// calculate total population method
	public int calculateTotalPopulation() {
		return (this.numberOfMales + this.numberOfFemales);
	}

	// this method calculates the population per square mile
	public double calculatePopulationPerSquareMile() {
		return (calculateTotalPopulation() / this.numberOfSquareMiles);
	}

	// this method calculates the population per state
	public double calculatePopulationPerState() {
		return ((double) calculateTotalPopulation() / (double) this.numberOfStates);
	}

	// this method gets the user input for the united states object
	public void getUserInput() {
		Scanner newScanner = new Scanner(System.in);

		System.out.print(this.nameOfCountry + " Number of males: ");
		this.setNumberOfMales(newScanner.nextInt());

		System.out.print(this.nameOfCountry + " Number of females: ");
		this.setNumberOfFemales(newScanner.nextInt());

		System.out.print(this.nameOfCountry + " Number of square miles: ");
		this.setNumberOfSquareMiles(newScanner.nextDouble());

		System.out.print(this.nameOfCountry + " Number of states: ");
		this.setNumberOfStates(newScanner.nextInt());
	}

	// for this method, I used the following source:
	// https://www.geeksforgeeks.org/overriding-tostring-method-in-java/
	// I didn't realize I could "override" the "toString" method, did I miss this in
	// the textbook chapter for this assignment?
	// once I figured this out (not too long to figure out), it cleaned up my code a
	// lot.
	public String toString() {
		return String.format(
				"Country Name: %s" + "\n\tTotal Population: %,d" + "\n\tPopulation per Square Mile: %,.2f"
						+ "\n\tPopulation per State: %,.2f",
						this.nameOfCountry, calculateTotalPopulation(), calculatePopulationPerSquareMile(),
						calculatePopulationPerState());
	}// end of toString method

}// end of Population class. This class does not have a main method inside. But,
// it's public, so the main class inside of DriverPopulation.java can access it.
