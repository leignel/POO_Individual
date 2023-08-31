package br.com.poo.balanco;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class BalancoTrimestralInt {
	
	private Integer gastosJaneiro = 15000;
	private Integer gastosFevereiro = 23000; 
	private Integer gastosMarco	= 17000;
	
	private Integer somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	private static Logger logger = Logger.
	public int soma() {

		//	System.out.printf("O balanço trimestral é de R$%d", somaTotal);
	logger.log(Level.INFO, "O balanço trimestral é de R$ ");
				 
	}
	
	public int soma(int janeiro) {
		System.out.printf("O gasto de Janeiro é de R$%d", janeiro);
		return janeiro;
	}
	
	public int soma(int janeiro, int fevereiro, int marco) {
		int somaTri = janeiro + fevereiro + marco;
		System.out.printf("O gasto do primeiro bimestre é de R$%d", somaTri);
		return somaTri;
	}
}	
