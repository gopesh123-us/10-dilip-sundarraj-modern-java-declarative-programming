package live.learnjava.java8.ComparatorLambas.temparea;

import java.util.List;

import live.learnjava.java8.functionalInterfaces.data.Student;
import live.learnjava.java8.functionalInterfaces.data.StudentDatabase;

public class PredicateExample {
	public static void main(String[] args) {
		PredicateG<Integer> checkIntGtFour = (i) -> {
			if (i >= 4)
				return true;
			else
				return false;
		};
		
		List<Student> students = StudentDatabase.getAllStudents();

		students.forEach((student) -> {
			if (checkIntGtFour.test(student.getGradeLevel())) {
				System.out.println(student.getName() + ": Grade level is greater than " + student.getGradeLevel());
			} else {
				System.out.println(student.getName() + ": Grade is " + student.getGradeLevel());
			}
		});
	}
}
