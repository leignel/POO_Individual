package br.com.poo.lista2;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Exercicio6 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Exercicio6.class.getName());
        Scanner scanner = new Scanner(System.in);
        int turma;
        double madrugada1 = 35.0, madrugada2 = 30.0, media, estudantes;

        logger.log(Level.INFO, "Quantos estudantes têm na turma? ");
        turma = scanner.nextInt();

        media = (madrugada1 + madrugada2) / 2;
        estudantes = (turma * media) / 100;

        logger.log(Level.INFO, "Em média, " + estudantes + "% dos estudantes estudam de madrugada nas duas primeiras disciplinas.");

        scanner.close();
    }
}