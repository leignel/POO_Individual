package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		double divisor;
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		if (n2 ==0) {
			System.out.println("Não é possível executar divisão por zero!");
		}else {
			System.out.println("\nNúmero 1: " + n1);
			System.out.println("\nNúmero 2: " + n2);
			System.out.println("\nSoma: " + (n1 + n2));
			System.out.println("\nSubtração: " + (n1 - n2));
			System.out.println("\nMultiplicação: " + (n1 * n2));
			divisor = n2;
			System.out.println("\nDivisão: " + (n1 / divisor));
			
			sc.close();
		}

	}

}
