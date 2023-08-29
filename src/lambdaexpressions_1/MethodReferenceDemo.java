
package lambdaexpressions_1;


import java.util.function.BiFunction;


public class MethodReferenceDemo {

	public static String appendStrings_1(String str_1, String str_2) {
		return str_1 + str_2;
	}


	public String appendStrings_2(String str_1, String str_2) {
		return str_1 + str_2;
	}


	public static <T> T mergeThings(T t_1, T t_2, BiFunction <T, T, T> merger) {
		return merger.apply (t_1, t_2);
	}


	public static void main(String [] args) {
		MethodReferenceDemo myApp = new MethodReferenceDemo ();

		// Calling the method mergeThings with a lambda expression
		System.out.println (mergeThings ("Hello, ", "World!", (s1, s2) -> s1 + s2));

		// Reference to a static method
		System.out.println (mergeThings ("Hello, ", "World!", MethodReferenceDemo::appendStrings_1));

		// Reference to an instance method of a particular object
		System.out.println (mergeThings ("Hello, ", "World!", myApp::appendStrings_2));

		// Reference to an instance method of an arbitrary object of a particular type
		System.out.println (mergeThings ("Hello, ", "World!", String::concat));

	}
}
