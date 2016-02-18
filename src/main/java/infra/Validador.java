package infra;

@FunctionalInterface
public interface Validador<T> {
	boolean valida(T t);
}
