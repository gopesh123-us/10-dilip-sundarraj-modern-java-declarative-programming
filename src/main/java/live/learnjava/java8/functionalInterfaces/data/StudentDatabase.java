package live.learnjava.java8.functionalInterfaces.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	public static List<Student> getAllStudents() {
		// 2 Students from Grade 2
		Student student1 = new Student("John", 2, 3.8, "Male", Arrays.asList("Drawing", "Soccer", "Reading"));
		Student student2 = new Student("Emily", 2, 3.5, "Female", Arrays.asList("Ballet", "Painting", "Crafting"));

		// 2 Students from Grade 3
		Student student3 = new Student("Michael", 3, 4.0, "Male", Arrays.asList("Basketball", "Chess", "Swimming"));
		Student student4 = new Student("Sophia", 3, 3.9, "Female", Arrays.asList("Gymnastics", "Piano", "Reading"));

		// 2 Students from Grade 4
		Student student5 = new Student("David", 4, 3.7, "Male", Arrays.asList("Football", "Coding", "Math Club"));
		Student student6 = new Student("Emma", 4, 3.6, "Female", Arrays.asList("Dance", "Drama", "Science Club"));

		return Arrays.asList(student1, student2, student3, student4, student5, student6);

	}
}
