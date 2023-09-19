package br.com.poo.lista2;

import java.util.logging.Logger;

public class Exercicio1 {
    
    private static final Logger logger = Logger.getLogger(Exercicio1.class.getName());
    
    public static void main(String[] args) {
        final int UNIVERSO = 42;
               
        logger.info("Qual o significado da vida, do universo e tudo mais?");
        logger.info("A resposta é " + UNIVERSO);
    }
}