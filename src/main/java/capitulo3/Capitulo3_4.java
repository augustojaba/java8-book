package capitulo3;

public class Capitulo3_4 {

	public static void main(String[] args) {
		
		int numero = 4;
		
		new Thread(() -> System.out.println(numero)).start();
		
	}
}
