package capitulos;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import modelo.Usuario;

public class Capitulo7 {
	
	public static void main(String[] args) {
		List<Usuario> usuarios = Usuario.pegarUmBucadoDeUsuarioFakes();
		
		usuarios.forEach(System.out::println);
		
		System.out.println();
		
		usuarios.sort(comparing(Usuario::getPontos).reversed());
		usuarios
		.subList(0, 3)
		.forEach(u -> {
			u.tornarModerador();
			System.out.println(u);
		});
		
		
		//7.2
		System.out.println("\n7.2\n");
		Stream<Usuario> stream = usuarios.stream().filter(u->u.getPontos() > 160);
		stream.forEach(System.out::println);
		
		System.out.println();
		usuarios.stream().filter(u->u.getPontos() > 100).forEach(System.out::println);
		
		//zerando para um novo teste
		System.out.println();
		
		usuarios.forEach(Usuario::removerPerfilModerador);
		usuarios.stream()
		.filter(u -> u.getPontos() > 160)
		.forEach(Usuario::tornarModerador);
		usuarios.forEach(System.out::println);
		
		System.out.println();
		usuarios.stream().filter(Usuario::isModerador).forEach(System.out::println);
		
		//7.3
		//zerando para um novo teste
		System.out.println("\n7.3\n");
		usuarios.forEach(Usuario::removerPerfilModerador);
		
		ArrayList<Usuario> maisque100 = new ArrayList<>();
		usuarios.stream().filter(u -> u.getPontos() > 100)
		.forEach(maisque100::add);
		maisque100.forEach(System.out::println);
		
		//7.4
		//zerando para um novo teste
		System.out.println("\n7.4\n");
		usuarios.forEach(Usuario::removerPerfilModerador);
		
//		Supplier<ArrayList<Usuario>> supp = ArrayList::new;
//		BiConsumer<ArrayList<Usuario>, Usuario> accumulator = ArrayList::add;
//		BiConsumer<ArrayList<Usuario>, ArrayList<Usuario>> combiner = ArrayList::addAll;
		
		List<Usuario> maisQue100 = usuarios.stream()
		.filter(u -> u.getPontos() > 160)
//		.collect(supp, accumulator, combiner);
//		.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		.collect(toList());
		
		maisQue100.forEach(System.out::println);
		
		//7.6
		//zerando para um novo teste
		System.out.println("\n7.6\n");
		usuarios.forEach(Usuario::removerPerfilModerador);
		
		List<Integer> pontosDosUsuarios = usuarios
		.stream()
		.map(Usuario::getPontos)
		.collect(toList());
		
		pontosDosUsuarios.forEach(System.out::println);
		
		//7.7
		//zerando para um novo teste
		System.out.println("\n7.7\n");
		usuarios.forEach(Usuario::removerPerfilModerador);
		
		IntStream mapInteger = usuarios
		.stream()
		.mapToInt(Usuario::getPontos);
		
		double media = usuarios
		.stream()
		.mapToInt(Usuario::getPontos)
		.average()
		.getAsDouble();
		
		System.out.println(media);
		
		//7.8
		//zerando para um novo teste
		System.out.println("\n7.8\n");
//		Supplier<List<Usuario>> list = ArrayList::new;
//		usuarios = list.get();
		
		//OptionalDouble optional = 
		usuarios
		.stream()
		.mapToInt(Usuario::getPontos)
		.average()
		.ifPresent(System.out::println);
		
//		Double pontuacaoMedia = optional
		//.orElse(0.0);
//		.orElseThrow(IllegalStateException::new);
//		System.out.println(pontuacaoMedia);
		
		//Supplier<List<Usuario>> list = ArrayList::new;
		//usuarios = list.get();
		usuarios.stream()
		.max(comparingInt(Usuario::getPontos))
		.ifPresent(System.out::println);
		
		Optional<String> maxNome = usuarios
		.stream()
		.max(comparingInt(Usuario::getPontos))
		.map(Usuario::getNome);
		
		System.out.println(maxNome);
		
	}

}
