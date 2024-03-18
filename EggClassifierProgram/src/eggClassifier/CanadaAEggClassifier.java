/*
 @author: Amirreza Mirzaei 
 @Date: November 27
 * - create a method inputPositiveDouble(String prompt) that ensures that only 
 *   positive numbers are entered, use this in the main method logic.
 */
package eggClassifier;

public class CanadaAEggClassifier {
	
	/*
	 * This is a utility class with only static members, prevents
	 * instantiation.
	 */
	private CanadaAEggClassifier() { }
	
	//ToDo:  Supervisor wants programmer comments here (use /* */ comment)
	public static char classifyCanadaAEgg(CanadaAEgg egg) {
		// This method will return a character based on the size designation for the egg:
		// J for Jumbo Size
		// E for Extra Large Size
		// L for Large Size
		// M for Medium Size
		// S for Small Size
		// P for Peewee Size
		char size = ' ';
		// get weight from CanadaAEgg
		double weight= egg.getWeight();	
		//determine the size
		if (weight >= 70) {
			size = 'J';
			
		} else if (weight >= 63) {
			size = 'E';
			
		} else if (weight >= 56) {
			size = 'L';  
			
	    } else if (weight >= 49) {
	    	size = 'M';
	    	
	    } else if (weight >= 42) {
	    	size = 'S';
	    	
	    	}
	    else {
	    	size= 'P';
	    }
		// Please refer to [1] to know how to determine the size designations for eggs.
		return size; //placeholder so the code will compile, update with the actual classification value
	}
}
/*
 * References:
 * [1] Egg Grade Requirements.  inspection.canada.ca.
 * https://inspection.canada.ca/about-cfia/acts-and-regulations/list-of-acts-and-regulations/documents-incorporated-by-reference/canadian-grade-compendium-volume-5/eng/1520869505643/1520869506282?chap=1 (Accessed Sept. 10, 2023).
 */

