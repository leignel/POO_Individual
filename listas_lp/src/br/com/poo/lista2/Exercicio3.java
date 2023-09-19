package br.com.poo.lista2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercicio3 {

    private static final Logger logger = Logger.getLogger(Exercicio3.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LINHA = 3;
        char resposta;

        String[][] matrizEstoque = {{"Arroz", "10kg"}, {"Feijão", "15kg"}, {"Macarrão", "13kg"}};
        String[][] matrizSem = {{"Açúcar", "0kg"}, {"Sal", "0kg"}, {"Sazon", "0kg"}};

        int valor;

        do {
            logger.info("1. Produtos com estoque\n2. Produtos sem estoque\n3. Sair\n");
            valor = sc.nextInt();

            switch (valor) {
                case 1:
                    for (int i = 0; i < LINHA; i++) {
                        logger.info("Existem " + matrizEstoque[i][1] + " de " + matrizEstoque[i][0] + " no estoque");
                    }
                    break;
                case 2:
                    for (int i = 0; i < LINHA; i++) {
                        logger.info("Existem " + matrizSem[i][1] + " de " + matrizSem[i][0] + " no estoque");
                    }
                    break;
                case 3:
                    logger.info("Deseja sair do programa?\nDigite 'S' se Sim e 'N' se deseja continuar\n");
                    resposta = sc.next().charAt(0);
                    if (resposta == 'S' || resposta == 's') {
                        logger.info("Programa encerrado");
                        sc.close();
                        System.exit(0);
                    } else if (resposta == 'N' || resposta == 'n') {
                        logger.info("Reiniciando...");
                    } else {
                        logger.info("Opção inválida. Por favor, escolha uma opção válida.");
                    }
                    break;
                default:
                    logger.info("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (valor != 3);
    }
}