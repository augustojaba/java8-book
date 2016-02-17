

import java.util.ArrayList;
import java.util.List;

public class Capitulo4_3 {
	
	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150, false);
		Usuario user2 = new Usuario("Rodrigo Turini", 120, false);
		Usuario user3 = new Usuario("Guilherme Silveira", 190, false);

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);usuarios.add(user2);usuarios.add(user3);

		usuarios.removeIf(u -> u.getPontos() > 160);
		usuarios.forEach(u -> System.out.println(u));
	}
}
