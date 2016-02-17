import java.util.Arrays;

import static java.util.Comparator.*;

import java.util.List;


public class Capitulo5_3 {

	public static void main(String[] args) {
		List<Usuario> usuarios = Usuario.pegarUmBucadoDeUsuarioFakes();
		
		usuarios.sort(comparing(u -> u.getNome()));
		usuarios.forEach(u -> System.out.println(u));
		
		System.out.println();
		
		//Capitulo 5.5
		usuarios.sort(comparingInt(u -> u.getPontos()));
		usuarios.forEach(u -> System.out.println(u));
		
		List<String> listaString = Arrays.asList("Augusto", "Zebra", "Belatton", "Focado");
		listaString.sort(naturalOrder());
		listaString.forEach(u -> System.out.println(u));
		
	}
}
