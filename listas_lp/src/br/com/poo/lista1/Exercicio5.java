package br.com.poo.lista1;

public class Exercicio5 {

	public static void main(String[] args) {
		int a, b;
		
		System.out.println("Esse algoritmo tem o objetivo de demonstrar o resultado de duas expressões ");
		System.out.println("\nA expressão A é 2+3-(5 * 8)-4+354-521+(7 * 66) ");
		System.out.println("\nA expressão B é 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9");
		
		a = 2+3-(5 * 8)- 4 + 354 - 521 + (7 * 66);
		b = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;
		
		System.out.println("\nO resultado da expressão A é: " + a);
		System.out.println("O resultado da expressão B é: " + b);
	}

}
