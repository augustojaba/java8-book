package infra;

@FunctionalInterface
public interface InterfaceFuncionalCriadora<T, S, I, B> {

	T apply(S s, I i, B b);
}