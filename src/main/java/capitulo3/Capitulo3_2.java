package capitulo3;

public class Capitulo3_2 {

	public static void main(String[] args) {
		Validador<String> validador = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
		System.out.println(validador.valida("60356001"));
		
		Runnable o = () -> System.out.println("o que sou eu?");
		
		System.out.println(o);
		System.out.println(o.getClass());
	}
}
