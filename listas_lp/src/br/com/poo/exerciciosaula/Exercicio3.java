package br.com.poo.exerciciosaula;

import java.util.Scanner;

// Exercicio 1 do slide do dia 29-08-2023

public class Exercicio3 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int soma;
		double divisao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa realiza a soma e a divisão de dois números!!!");
		System.out.println("\nDigite o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("\nDigite o segundo número: ");
		n2 = sc.nextInt();
		
		
		sc.close();
		
		soma = (n1) + (n2);
		
		
		divisao = (double) n1/n2;
		
		System.out.println("\nO resultado da soma dos dois números é igual a " + soma);
		
		System.out.println("\nO resultado da divisão dos dois números é igual a " +divisao);
	}

}
