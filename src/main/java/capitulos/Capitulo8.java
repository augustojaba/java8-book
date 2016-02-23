package capitulos;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import modelo.Usuario;

public class Capitulo8 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Usuario> usuarios = Usuario.pegarUmBucadoDeUsuarioFakes();
		
		usuarios.forEach(System.out::println);
		
		System.out.println("\n8.1\n");
		
		usuarios.stream()
		.filter(u -> u.getPontos() > 100)
		.sorted(Comparator.comparing(Usuario::getNome))
		.forEach(System.out::println);
		
		List<Usuario> usuariosColetadosOrdenados = usuarios.stream()
		.filter(u -> u.getPontos() > 160)
		.sorted(Comparator.comparing(Usuario::getNome))
		.collect(Collectors.toList());
		
		System.out.println();
		usuariosColetadosOrdenados.forEach(System.out::println);
		
		System.out.println("\n8.3\n");
		
		Usuario findAny = usuarios
		.stream()
		.filter(u -> u.getPontos() > 160)
		.findAny()
		.get();
		
		System.out.println("\n8.4\n");
		
		//usuarios.forEach(System.out::println);
		
		usuarios.stream()
//		.filter(u -> u.getPontos() > 160)
		.sorted(Comparator.comparing(Usuario::getNome))
		.peek(System.out::println)
		.findAny();
		
		System.out.println("\n8.5\n");
		usuarios.forEach(System.out::println);
		Long multiplicacao = usuarios.stream()
			.mapToLong(Usuario::getPontos)
			.reduce(1, (a,b) -> a*b);
		System.out.println(multiplicacao);
		
		Integer soma = usuarios.stream()
			.reduce(0, (atual, a) -> atual + a.getPontos(), Integer::sum);
		System.out.println(soma);
		
	}

}
