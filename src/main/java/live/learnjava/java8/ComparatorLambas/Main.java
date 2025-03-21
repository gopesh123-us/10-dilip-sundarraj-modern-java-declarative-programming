package live.learnjava.java8.ComparatorLambas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Running..."); // implement
		new Thread(r).start();
		
		//implement
		Comparator<String> compaartorLambda = (String a, String b) -> {
			return a.length() - b.length();
		};
		
		//sort list by length
		List<String> name = Arrays.asList("Gopesh", "Raj", "Sumit", "Sundarraj", "Vik");
		List<String> sortedList = name.stream().sorted(compaartorLambda).toList();
		System.out.println(name);
		System.out.println(sortedList);
		
		new Thread(()->System.out.println("Running inside a new Thread")).start();
		
	}
}
