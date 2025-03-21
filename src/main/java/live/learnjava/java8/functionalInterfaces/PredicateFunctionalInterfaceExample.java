package live.learnjava.java8.functionalInterfaces;

import java.util.function.Predicate;

/*
 * In this class we will showcase a simple use cases using predicate 
 * functional interface. A predicate functional interface, takes and input
 * and does it's operation on it test(T t) and returns a boolean
 * */
public class PredicateFunctionalInterfaceExample {
	public static Predicate<Integer> isEven = (integer)->(integer % 2) == 0;
	public static Predicate<Integer> isDivisibleByFive = (integer) -> (integer % 5) == 0;
	
	public static void checkIfEven() {
		Integer integer = 12;
		Boolean result = isEven.test(integer);
		System.out.println("The number "+ integer +" even: " + result);			
	}
	
	public static void checkIfEvenAndDivisibleByFive() {
		Integer integer = 20;
		Boolean result = isEven.and(isDivisibleByFive).test(integer);
		System.out.println("The number " + integer + " is even and divible by 5: " + result);
	}
	
	public static void checkIfEvenOrDivibleByFive() {
		Integer integer = 11;
		Boolean result = isEven.or(isDivisibleByFive).test(integer);
		System.out.println("The number " + integer + " is even or divible by 5: " + result);
		
	}
	public static void main(String[] args) {
		checkIfEven();
		checkIfEvenAndDivisibleByFive();
		checkIfEvenOrDivibleByFive();
	}
}
