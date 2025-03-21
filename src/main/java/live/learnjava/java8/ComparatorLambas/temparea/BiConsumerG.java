package live.learnjava.java8.ComparatorLambas.temparea;

@FunctionalInterface
public interface BiConsumerG<T, U> {
	void accept(T t, U u);
}
