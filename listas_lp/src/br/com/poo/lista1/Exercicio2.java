package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int colega1, colega2, colega3, colega4, colega5, minhaidade, tvida;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a idade do colega 1?");
			colega1 = sc.nextInt();
		System.out.println("\nQual é a idade do colega 2?");
			colega2 = sc.nextInt();
		System.out.println("\nQual é a idade do colega 3?");
			colega3 = sc.nextInt();
		System.out.println("\nQual é a idade do colega 4?");
			colega4 = sc.nextInt();
		System.out.println("\nQual é a idade do colega 5?");
			colega5 = sc.nextInt();
		System.out.println("\nQual é a minha idade?");
			minhaidade = sc.nextInt();
			
		tvida = colega1 + colega2 + colega3 + colega4 + colega5 + minhaidade;
		
		System.out.println("\n\nOs tempos de vida somados são " + tvida);	
		
		sc.close();

	}

}
