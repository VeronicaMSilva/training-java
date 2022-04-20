package javalogica;

public class Aula05Relacionais {

	public static void main(String[] args) {
		
		System.out.println(5 < 2);
		
		int num1 = 40;
		
		System.out.println(num1 != 67);
		System.out.println(num1 != 40);
		System.out.println(false);
		
		
		int num2 = 32;
		
		System.out.println(num1 <= num2);
		
		boolean comparacao = num1 >= num2;
		System.out.println(comparacao);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean logicaE = verdadeiro && falso;
		System.out.println("Lógica E: " + logicaE);
		
		boolean logicaOU = true || true;
		System.out.println(logicaOU);
		
		boolean negacao = !true;
		System.out.println(negacao);
		
		boolean neGaçao = true;
		
		System.out.println("--------------");
		
		// COMPARAR STRINGS
		
		String nome1 = "veronica";
		String nome2 = "veronica";
		String nome3 = new String("veronica");
	
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1 == nome3);
		System.out.println(nome1.equalsIgnoreCase(nome3));
		
		
		
		

	}

}
