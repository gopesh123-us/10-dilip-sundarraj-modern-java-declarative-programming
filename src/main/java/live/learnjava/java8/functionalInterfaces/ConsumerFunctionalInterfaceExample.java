package live.learnjava.java8.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println("My name is " + s.toUpperCase());
		consumer.accept("Gopesh Sharma");
	}
}
