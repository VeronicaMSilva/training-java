package javalogica;

public class Aula08SaidaDeDados {

	public static void main(String[] args) {
		
		float nota = 8.2f;
		
		System.out.println("A ver�nica tirou: " + nota);
		System.out.printf("A ver�nica tirou: %.1f \n", nota);
		System.out.format("A ver�nica tirou: %.1f \n", nota);
		
		String nome = "Anna";
		
		System.out.printf("O %s tirou: %.3f", nome, nota);
	}

}
