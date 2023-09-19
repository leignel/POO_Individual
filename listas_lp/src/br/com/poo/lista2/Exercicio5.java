package br.com.poo.lista2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio5 {
    private static final Logger logger = Logger.getLogger(Exercicio5.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h; 
        double s;

        logger.info("Digite a quantidade de horas que deseja converter para segundos: ");
        h = sc.nextDouble();

        s = h * 3600;
        
        sc.close();
        
        logger.info("Para saber quanto vale os segundos representados basta multiplicar as horas por 3600\n");
        logger.log(Level.INFO, "{0} horas equivalem a {1} segundos", new Object[]{h, s});
    }
}