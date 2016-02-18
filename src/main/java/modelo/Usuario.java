package modelo;
import java.util.Arrays;
import java.util.List;

public class Usuario {

	private String nome;
	private Integer pontos;
	private boolean moderador;
	
	public Usuario() {
		this.nome = "Usu�rio Padr�o para Testes";
	}

	public Usuario(String nome, Integer pontos, Boolean moderador) {
		super();
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = moderador;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPontos() {
		return pontos;
	}

	public boolean isModerador() {
		return moderador;
	}

	public void tornarModerador() {
		this.moderador = true;
	}
	
	public void removerPerfilModerador() {
		this.moderador = false;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", pontos=" + pontos + ", moderador=" + moderador + "]";
	}
	
	public static List<Usuario> pegarUmBucadoDeUsuarioFakes() {
		Usuario user1 = new Usuario("ZZJos� Augusto", 160, false);
		Usuario user2 = new Usuario("Jos� Arnold", 160, false);
		Usuario user3 = new Usuario("Antonio Augusto", 90, false);
		Usuario user4 = new Usuario("Luis Augusto", 160, false);
		Usuario user5 = new Usuario("Francisco Jos�", 190, false);
		
		return Arrays.asList(user1, user2, user3, user4, user5);
	}

}
