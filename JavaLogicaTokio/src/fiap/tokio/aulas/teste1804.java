package fiap.tokio.aulas;

import java.util.Scanner;

public class teste1804 {

	public static void main(String[] args) {
		
		System.out.println("Ol� Mundo com hack");
		
		String nome = "Ver�nica";
		System.out.println(nome);
		System.out.println("Oi, " + nome);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome2 = entrada.nextLine();
		System.out.println(nome2);
		
		int idade = 16;
		
		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();
		
		System.out.println("");
		System.out.println("Ol�, " + nome + "! Voc� tem " + idade + " anos.");
		
		entrada.close();
	}

}
