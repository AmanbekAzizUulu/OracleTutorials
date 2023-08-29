
package lambdaexpressions;


import java.util.Arrays;
import java.util.List;


public class MethodReferenceDemo2 {

	public static void main(String [] args) {
		List <Person> rooster = Person.createRoster ();

		Person [] roosterAsArray = rooster.toArray (new Person [rooster.size ()]);

		// Notice that the interface Comparator is a functional interface.
		// Therefore, you could use a lambda expression instead of defining and
		// then creating a new instance of a class that implements Comparator:
		Arrays.sort (roosterAsArray, (person_1, person_2) -> {
			return person_1.getBirthday ().compareTo (person_2.getBirthday ());
		});
		printAllPersons (roosterAsArray);

	}


	public static void printAllPersons(Person [] roosterAsArray) {
		for (Person person : roosterAsArray) {
			System.out.println (person);
		}
	}
}
