package capitulos;

import static java.util.Comparator.*;

import java.util.ArrayList;
import java.util.List;
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
		System.out.println("7.2");
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
		System.out.println("7.3");
		usuarios.forEach(Usuario::removerPerfilModerador);
		
		ArrayList<Usuario> maisque100 = new ArrayList<>();
		usuarios.stream().filter(u -> u.getPontos() > 100)
		.forEach(maisque100::add);
		maisque100.forEach(System.out::println);
		
		//7.4
		//zerando para um novo teste
		System.out.println("7.4");
		usuarios.forEach(Usuario::removerPerfilModerador);
		
	}

}
