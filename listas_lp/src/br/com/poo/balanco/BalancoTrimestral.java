package br.com.poo.balanco;

import java.math.BigDecimal;

public class BalancoTrimestral {

	public static void main(String[] args) {			
		//instancia do balanco Integer
		BalancoTrimestralInt bti = new BalancoTrimestralInt();
		//chamada dos diferentes metodos da classe BalancoTrimestralInt
		bti.soma();
		bti.soma(10000);
		bti.soma(10, 50);	
		bti.soma(10, 50, 2900);
		
		//instancia do balanco Double
		BalancoTrimestralDouble btd = new BalancoTrimestralDouble();
		//chamada dos diferentes metodos da classe BalancoTrimestralDouble
		btd.soma();
		btd.soma(258);
		btd.soma(5000, 3000);
		btd.soma(0, 0, 10);
		
		//instancia do balanco BigDecimal
		BalancoTrimestralBigDecimal btg = new BalancoTrimestralBigDecimal();
		//chamada dos diferentes metodos da classe BalancoTrimestralBigDecimal
		btg.soma();
		btg.soma(new BigDecimal(10000));
		btg.soma(new BigDecimal(100), new BigDecimal(50));
		btg.soma(new BigDecimal(100), new BigDecimal(50), new BigDecimal(50000));
	}

}
