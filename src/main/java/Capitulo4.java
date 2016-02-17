

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo4 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150, false);
		Usuario user2 = new Usuario("Rodrigo Turini", 120, false);
		Usuario user3 = new Usuario("Guilherme Silveira", 190, false);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		Consumer<Usuario> tornarModeradores = u -> u.tornarModerador();
		Consumer<Usuario> imprimirUsuarios = u -> System.out.println(u);
		usuarios.forEach(tornarModeradores.andThen(imprimirUsuarios));
	}
}
