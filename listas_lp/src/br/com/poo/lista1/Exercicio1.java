package br.com.poo.lista1;

import java.util.Scanner; //importando leia

//in = entrada de dados out = saída de dados.   EX: System.in(entrada de dados) // System.out(saida de dados)

//programa do portugol
public class Exercicio1 {
	
	public static void main(String[] args) { //funcao inicio do portugol
		
		String nome;
		String sobrenome;
		Scanner sc = new Scanner (System.in); //Importando biblioteca para utilizar o leia sintaxe (Biblioteca apelido = new Scanner)
			
		System.out.println("Por favor, informe seu nome: "); //funcao escreva do portugol
			nome = sc.next();
		for(int i=0; i<2; i++) { //utilizacao do laco for para limpar a tela
			System.out.println("\n");
		}
		System.out.println("Agora, informe seu sobrenome: ");		
			sobrenome = sc.next();
		
			sc.close();
			
		System.out.println("Seja bem vindo-(a) " + nome + " " + sobrenome);
		
	}

}
