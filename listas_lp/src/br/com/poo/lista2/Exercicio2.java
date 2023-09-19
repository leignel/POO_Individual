package br.com.poo.lista2;

import java.util.Scanner;
import java.util.Calendar;
import java.util.logging.Logger;

public class Exercicio2 {
    
    private static final Logger logger = Logger.getLogger(Exercicio2.class.getName());
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        
        int dia, mes, ano, idade;
        
        logger.info("Digite o dia do seu nascimento: ");
        dia = sc.nextInt();
        logger.info("Digite o mês do seu nascimento: ");
        mes = sc.nextInt();
        logger.info("Digite o ano do seu nascimento: ");
        ano = sc.nextInt();
        
        idade = calendario.get(Calendar.YEAR) - ano;
        
        if (mes > calendario.get(Calendar.MONTH) + 1) {
            idade--;
        }
        
        if (dia > calendario.get(Calendar.DAY_OF_MONTH) && mes <= calendario.get(Calendar.MONTH) + 1) {
            idade--;
        }
        
        logger.info("A sua idade é " + idade + " anos");
        
        sc.close();
    }
}