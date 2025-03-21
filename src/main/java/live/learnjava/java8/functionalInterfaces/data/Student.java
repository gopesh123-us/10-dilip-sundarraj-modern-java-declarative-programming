package live.learnjava.java8.functionalInterfaces.data;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Student {
	private String name;
	private int gradeLevel;
	private double gpa;
	private String gender;
	List<String> activities = new ArrayList<>();
	
}
