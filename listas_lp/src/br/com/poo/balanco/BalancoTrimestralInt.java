package br.com.poo.balanco;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralInt {

	private Integer gastosJaneiro = 15000;
	private Integer gastosFevereiro = 23000;
	private Integer gastosMarco = 17000;
	private Integer gastoAbril = 18000;
	private Integer gastoMaio = 19000;
	private Integer gastoJunho = 20000;
	private Integer gastoJulho = 21000;
	
	private Integer somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco + gastoAbril + gastoMaio + gastoJunho + gastoJulho;
	private DecimalFormat df = new DecimalFormat("#,###.00");
	private Logger customLogger = Util.setupLogger();

	public int soma() {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O balanço trimestral é de R$ " + df.format(somaTotal));
		return somaTotal;
	}
	
	public int soma(int janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O gasto de janeiro foi de R$ " + df.format(janeiro));
		return janeiro;
	}
	
	public int soma(int janeiro, int fevereiro) {
		Util.customizer();
		int somaBi = janeiro + fevereiro;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro bimestre foi de R$ " + df.format(somaBi));
		return somaBi;
	}
	
	public int soma(int janeiro, int fevereiro, int marco) {
		Util.customizer();
		int somaTri = janeiro + fevereiro + marco;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro trimestre foi de R$ " + df.format(somaTri));
		return somaTri;
	}
	
	
}

