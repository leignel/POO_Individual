package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f, c;
		
		System.out.println("Digite a temperatura em graus celsius: ");
		c = sc.nextDouble();
		
		f = (c * 1.8) + 32;
		
		System.out.println("Temperatura em °C: " + c);
		System.out.println("Temperatura em °F: " + f);
		
		sc.close();
	}

}
