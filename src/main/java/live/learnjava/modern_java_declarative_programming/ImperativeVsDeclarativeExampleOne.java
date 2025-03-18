package live.learnjava.modern_java_declarative_programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * sum of 100 numbers from 0 to 100
 * */
public class ImperativeVsDeclarativeExampleOne {
	public static void main(String[] args) {
		/**
		 * Imperative Programming
		 */
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		int n = 100;
		int result = (n*(n+1))/2;
		System.out.println(result);

		/*
		 * declarative
		 * */
        int totalSum = generateList().stream().reduce(0, Integer::sum);
        System.out.println("Total Sum: "+totalSum);



	}
	public static List<Integer> generateList() {
		return IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toList());
	}
}
