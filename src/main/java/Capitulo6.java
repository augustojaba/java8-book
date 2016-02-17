import static java.util.Comparator.comparingInt;
import infra.InterfaceFuncionalCriadora;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;


public class Capitulo6 {
	
	public static void main(String[] args) {
		List<Usuario> usuarios = Usuario.pegarUmBucadoDeUsuarioFakes();
		
		//usuarios.forEach(Usuario::tornaModerador);
		usuarios.forEach(System.out::println);
		System.out.println();
		
		//6.2
		//Function<? super Usuario, ? extends String> byName = Usuario::getNome;
		//usuarios.sort(nullsLast(comparing(byName)));
		//usuarios.forEach(u -> System.out.println(u));
		
		//System.out.println();
		
		//6.3
		usuarios.sort(comparingInt(Usuario::getPontos).reversed().thenComparing(Usuario::getNome));
		usuarios.forEach(System.out::println);
		
		//6.4 e 6.5
		/*Consumer<? super Usuario> consumer = Usuario::tornaModerador;
		usuarios.forEach(consumer);*/
		
		System.out.println();
		
		Runnable bloco = usuarios.get(0)::tornaModerador;
		bloco.run();
		usuarios.forEach(System.out::println);
		
		System.out.println();
		
		//6.6
		Supplier<Usuario> meuUsuario = Usuario::new;
		System.out.println(meuUsuario.get().toString());
		
		InterfaceFuncionalCriadora<Usuario, String, Integer, Boolean> criadorUsuario = Usuario::new;
		System.out.println(criadorUsuario.apply("Usuario teste criado", 120, false).toString());
		
		//Não funcionou essa parte de instânciação com new no Vetor.
		//Supplier<int[]> meuVetor = int[25]::new;
		
		//6.7
		//Mais lento pois realiza os auto boxing automaticamente.
		BiFunction<Integer, Integer, Integer> max = Math::max;
		System.out.println(max.apply(23, 12));
		
		//Mais rápido pois evita os auto boxing automáticos.
		ToIntBiFunction<Integer, Integer> max2 = Math::max;
		System.out.println(max2.applyAsInt(12, 10));
		
		IntBinaryOperator max3 = Math::max;
		System.out.println(max3.applyAsInt(0, 10));
		
	}

}
