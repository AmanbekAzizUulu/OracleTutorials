
package lambdaexpressions;


import java.util.Comparator;


public class ClassPersonAgeComparator implements Comparator <Person> {

	@ Override
	public int compare(Person p1, Person p2) {
		return p1.getAge ().compareTo (p2.getAge ());
	}

}
