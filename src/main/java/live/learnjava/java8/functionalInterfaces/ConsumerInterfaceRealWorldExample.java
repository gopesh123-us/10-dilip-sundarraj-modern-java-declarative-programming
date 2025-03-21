package live.learnjava.java8.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import live.learnjava.java8.functionalInterfaces.data.Student;
import live.learnjava.java8.functionalInterfaces.data.StudentDatabase;

public class ConsumerInterfaceRealWorldExample {
	
	static Consumer<Student> printAllData = (student) -> System.out.println(student);
	static Consumer<Student> names = (student) -> System.out.print(student.getName());
	static Consumer<Student> activities = (student)-> System.out.println(student.getActivities());
	
	public static void printNames() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(printAllData);
	}
	
	public static void printNamesAndActivities() {
		
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(names.andThen(activities));
	}
	
	public static void printNamesAndActivitiesUsingCondition() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach((student)->{
			if(student.getGradeLevel() != 2 && student.getGender().equalsIgnoreCase("Female")) {
				names.andThen(activities).accept(student);
			}
		});
	}
		
	public static void main(String[] args) {
	
		printNames();
		System.out.println();
		printNamesAndActivities();
		System.out.println();
		printNamesAndActivitiesUsingCondition();
	}
}
