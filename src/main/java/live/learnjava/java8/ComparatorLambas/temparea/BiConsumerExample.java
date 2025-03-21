package live.learnjava.java8.ComparatorLambas.temparea;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		BiConsumerG<String, String> bi = (a, b) -> System.out.println("Hi " + a + ", Good " + b);
		bi.accept("Gopesh", "Morning");
		System.out.println();
		//get data
		Map<String, Double> studentGrades = new HashMap<>();
		studentGrades.put("Rohit", 3.8);
		studentGrades.put("Sumit", 3.5);
		studentGrades.put("Raj", 3.0);
		studentGrades.put("Amit", 5.0);
		studentGrades.put("Meera", 4.5);
		
		//define lambda
		BiConsumer<String, Double> printStudentInfo = (name, grade) -> {System.out.println(name + " has a GPA of " + grade);};
		
		//use lambda
		studentGrades.forEach(printStudentInfo);
	}
}
