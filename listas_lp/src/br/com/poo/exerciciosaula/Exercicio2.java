package br.com.poo.exerciciosaula;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int n1, n2, soma;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Seja bem vindo ao programa soma de dois números");
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o seguindo número: ");
		n2 = sc.nextInt();
		
		soma = (n1) + (n2);
	
		System.out.println("A soma dos dois números é igual a " + soma);
			
		sc.close();
		
	}

}