package br.com.poo.balanco;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralDouble {

	private Double gastosJaneiro = 15000.00;
	private Double gastosFevereiro = 23000.00;
	private Double gastosMarco = 17000.00;
	
	private Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	private DecimalFormat df = new DecimalFormat("#,###.00");
	private Logger customLogger = Util.setupLogger();
	
	public double soma() {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O balanço trimestral é de R$ " + df.format(somaTotal));
		return somaTotal;
	}
	
	public double soma(double janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O gasto de janeiro foi de R$ " + df.format(janeiro));
		return janeiro;
	}
	
	public double soma(double janeiro, double fevereiro) {
		Util.customizer();
		Double somaBi = janeiro + fevereiro;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro bimestre foi de R$ " + df.format(somaBi));
		return somaBi;
	}
	
	public double soma(double janeiro, double fevereiro, double marco) {
		Util.customizer();
		Double somaTri = janeiro + fevereiro + marco;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro trimestre foi de R$ " + df.format(somaTri));
		return somaTri;
	}
	
}