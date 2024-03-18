/*
 @author: Amirreza Mirzaei 
 @Date: November 27
 * - create a method inputPositiveDouble(String prompt) that ensures that only 
 *   positive numbers are entered, use this in the main method logic.
 */

/*
 * This class models a Canada A (or Grade A) egg with measurement for its 
 * weight in grams.  
 * A constant is provided for the default weight of a Canada A egg.
 */
package eggClassifier;

public class CanadaAEgg {

	//ToDo:  Define a constant named DEFAULT_WEIGHT with a value of 57.50
	//initial value of the instance variable weight
	private static final double DEFAULT_WEIGHT = 57.50;
	
	private double weight; // Measured weight in grams
	
	/*
	 * No-argument constructor, sets weight to the default weight.
	 */
	public CanadaAEgg() {
		// ToDo:  Set the weight of the egg with the value of the constant DEFAULT_WEIGHT
		this.weight= DEFAULT_WEIGHT;
	}
	
	/*
	 * Overloaded constructor, sets weight as specified.
	 */
	public CanadaAEgg(double weight) {
		this.weight = weight;
	}

	/*
	 * Accessor for weight, uses grams as unit of measure
	 */
	public double getWeight() {
		return weight;
	}

	
	// Mutator for weight, uses grams as unit of measure
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * Returns a String that represents the data held within this object.
	 */
	public String toString() {
		String result;

		// the \ in the text-block escapes so there is no line-feed at the end
		// of the generated String.
		result = String.format(
				"""
				Entered weight is %.2f (grams) \
				""", weight);
		
		return result;
	}
	
}
