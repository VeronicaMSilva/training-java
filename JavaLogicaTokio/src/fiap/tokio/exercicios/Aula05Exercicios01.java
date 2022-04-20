package fiap.tokio.exercicios;

import java.util.Scanner;

public class Aula05Exercicios01 {

	public static void main(String[] args) {
		
		String nomeCompleto = "Verônica Maria da Silva";
		String endereco = "Av. Paulista, 1106";
		String cep = "01310-100";
		String cpf = "123.456.789.00";
		String telefone = "11 91234-5698";
		
		System.out.println(nomeCompleto);
		System.out.println(endereco);
		System.out.println(cep);
		System.out.println(cpf);
		System.out.println(telefone);
		
		System.out.println("............Exercicios 02.............");
		
		int numero1 = 15;
		float numero2 = 505f;
		double numero3 = 6.06;
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		
		String str1 = Double.toString(numero3);
		String str2 = Integer.toString(numero1);
		String str3 = Float.toString(numero2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("............Exercicios 03.............");
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite seu gênero: (M)masculino (F)feminino (O)outros (N)nao quero informar");
		char genero = entrada.nextLine().charAt(0);
		System.out.println("Olá, "+ nome + "! Você escolheu a seguinte opção de gênero:" + genero);
		
		System.out.println("............Exercicios 04.............");
		
		
		
		
		
		
		
	}

}
