package live.learnjava.java8.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import live.learnjava.java8.functionalInterfaces.data.Student;
import live.learnjava.java8.functionalInterfaces.data.StudentDatabase;

public class BiConsumerFunctionalInterfaceExample {
	
	public static void printNameAndGrade() {
		//define lambda
	    BiConsumer<String, Integer> printNameAndGrade = (name, grade)->{System.out.println(
	    		name + " has grade: " + grade
	    		);};
		//get data
		List<Student> students = StudentDatabase.getAllStudents();
		
		//lambda + data
		students.forEach((student)->printNameAndGrade.accept(student.getName(), student.getGradeLevel()));
	}
	public static void printNameAndActivities() {
		// define BiConsumer Lambda
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
			System.out.println(name + " : " + activities);
		};

		// get data
		List<Student> students = StudentDatabase.getAllStudents();

		// use BiConsumer on data
		students.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {
		// use BiConsumer and perform multiplication of two numbers

		BiConsumer<Integer, Integer> multiplyAndPrint = (a, b) -> {
			System.out.print("Result of multiply: " + a * b);
		};
		BiConsumer<Integer, Integer> divisionAndPrint = (a, b) -> System.out
				.println(" and Result of Division: " + a / b);

		multiplyAndPrint.andThen(divisionAndPrint).accept(1, 3);
		multiplyAndPrint.andThen(divisionAndPrint).accept(4, 2);
		multiplyAndPrint.andThen(divisionAndPrint).accept(10, 5);
		System.out.println();
		printNameAndActivities();
		System.out.println();
		printNameAndGrade();
	}
}
