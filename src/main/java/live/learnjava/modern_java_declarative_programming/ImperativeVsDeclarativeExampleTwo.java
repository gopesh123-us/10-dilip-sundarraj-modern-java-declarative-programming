package live.learnjava.modern_java_declarative_programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Removing duplicates from a list of integers
 * */
public class ImperativeVsDeclarativeExampleTwo {
	public static void main(String[] args) {
		//create a list of integers
		//create an empty set
		//iterate and add to the new set
		int[] numbers = {1,3,4,5,2,2,5,6,3,2,6,3,2,1};
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			set.add(numbers[i]);
		}
		System.out.println(set);

		List<Integer> numList = Arrays.asList(1,3,4,5,2,2,5,6,3,2,6,3,2,1);
		List<Integer> noDuplicates = numList.stream().distinct().collect(Collectors.toList());
		System.out.println(noDuplicates);
	}
}
