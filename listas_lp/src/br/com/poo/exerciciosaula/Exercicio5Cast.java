package br.com.poo.exerciciosaula;

public class Exercicio5Cast {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		double gastosTrimestreDouble = 0;
		
		System.out.println("Esse programa tem o objetivo de demonstrar os gastos trimestrais de nossa empresa");
		gastosTrimestreDouble = (double) gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("\nOs gastos do trimestre na variavel Integer foram de: " + gastosTrimestreDouble);

	}

}
