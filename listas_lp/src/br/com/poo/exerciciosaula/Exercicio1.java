package br.com.poo.exerciciosaula;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		String nome;
		String sobrenome;
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Por favor, informe seu nome: "); 
			nome = sc.next();
	
		System.out.println("\nAgora, informe seu sobrenome: ");		
			sobrenome = sc.next();
		
			sc.close();
			
		System.out.println("\nSeja bem vindo-(a) " + nome + " " + sobrenome);
		
	}

}
