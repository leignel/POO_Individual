package br.com.poo.lista2;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Exercicio4 {

    private static final Logger logger = Logger.getLogger(Exercicio4.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Digite o primeiro ângulo: ");
        double a = scanner.nextDouble();
        logger.info("Digite o segundo ângulo: ");
        double b = scanner.nextDouble();
        logger.info("Digite o terceiro ângulo: ");
        double c = scanner.nextDouble();

        if (validarAngulos(a, b, c)) {
            if (a + b + c == 180) {
                if (a < 90 && b < 90 && c < 90) {
                    logger.log(Level.INFO, "Os ângulos " + a + ", " + b + " e " + c + " formam um triângulo acutângulo.");
                } else if (a == 90 || b == 90 || c == 90) {
                    logger.log(Level.INFO, "Os ângulos " + a + ", " + b + " e " + c + " formam um triângulo retângulo.");
                } else if (a > 90 || b > 90 || c > 90) {
                    logger.log(Level.INFO, "Os ângulos " + a + ", " + b + " e " + c + " formam um triângulo obtusângulo.");
                }
            } else {
                logger.log(Level.INFO, "Os ângulos não formam um triângulo válido (a soma não é 180 graus).");
            }
        } else {
            logger.log(Level.INFO, "Os ângulos do triângulo são inválidos (não são positivos ou a soma não é 180 graus).");
        }

        scanner.close();
    }

    private static boolean validarAngulos(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0;
    }
}