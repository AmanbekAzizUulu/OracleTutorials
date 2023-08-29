
package lambdaexpressions;


import java.util.Arrays;
import java.util.List;


public class MethodReferenceDemo3 {

	public static void main(String [] args) {
		List <Person> rooster = Person.createRoster ();

		Person [] roosterAsArray = rooster.toArray (new Person [rooster.size ()]);

		// Because this lambda expression invokes an existing method, you can
		// use a method reference instead of a lambda expression:
		Arrays.sort (roosterAsArray, Person::compareByAge);
		printAllPersons (roosterAsArray);
	}


	public static void printAllPersons(Person [] roosterAsArray) {
		for (Person person : roosterAsArray) {
			System.out.println (person);
		}
	}
}
