package live.learnjava.java8.beforeJava8;

public class RunnableLambdaExample {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("current thread: "+Thread.currentThread().getName());
		/**
		 * prior jav8
		 */
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Running..runnable");
				String current = Thread.currentThread().getName();
				System.out.println("current thread: " + current);
			}
		};

		// instance of runnable is ready, pass this to the thread.
		Thread thread = new Thread(runnable);
		
		thread.start();
	}
}
