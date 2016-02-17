import java.util.Arrays;
import java.util.List;


public class Capitulo5_1 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("José Augusto", 160, false);
		Usuario user2 = new Usuario("José Arnold", 110, false);
		Usuario user3 = new Usuario("Antonio Augusto", 90, false);
		Usuario user4 = new Usuario("Luis Augusto", 140, false);
		Usuario user5 = new Usuario("Francisco José", 190, false);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4, user5);
		
		usuarios.sort((u1, u2) -> u1.getPontos().compareTo(u2.getPontos()));
		usuarios.forEach(u -> System.out.println(u));
		
	}
}
