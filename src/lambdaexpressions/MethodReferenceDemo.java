
package lambdaexpressions;


import java.util.Arrays;
import java.util.List;


public class MethodReferenceDemo {

	public static void main(String [] args) {
		List <Person> rooster = Person.createRoster ();

		Person [] roosterAsArray = rooster.toArray (new Person [rooster.size ()]);

		// Suppose that the members of your social networking application are
		// contained in an array, and you want to sort the array by age. You
		// could use the following code :
		Arrays.sort (roosterAsArray, new ClassPersonAgeComparator ());
		printAllPersons (roosterAsArray);

	}


	public static void printAllPersons(Person [] roosterAsArray) {
		for (Person person : roosterAsArray) {
			System.out.println (person);
		}
	}
}
