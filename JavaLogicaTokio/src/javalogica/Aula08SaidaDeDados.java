package javalogica;

public class Aula08SaidaDeDados {

	public static void main(String[] args) {
		
		float nota = 8.2f;
		
		System.out.println("A verônica tirou: " + nota);
		System.out.printf("A verônica tirou: %.1f \n", nota);
		System.out.format("A verônica tirou: %.1f \n", nota);
		
		String nome = "Anna";
		
		System.out.printf("O %s tirou: %.3f", nome, nota);
	}

}
