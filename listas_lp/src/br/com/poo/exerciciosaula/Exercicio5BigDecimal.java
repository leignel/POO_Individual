package br.com.poo.exerciciosaula;

import java.math.BigDecimal;

public class Exercicio5BigDecimal {

	public static void main(String[] args) {
		BigDecimal gastosJaneiro = new BigDecimal("15000.0");
		BigDecimal gastosFevereiro = new BigDecimal("23000.0");
		BigDecimal gastosMarco = new BigDecimal("17000.0");
		
		BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);
		
		System.out.println("\nOs gastos do trimestre na variavel BigDecimal foram de: " + gastosTrimestre);

	}

}
