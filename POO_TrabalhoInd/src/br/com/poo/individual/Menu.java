package br.com.poo.individual;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.io.LeituraEscrita;
import br.com.poo.individual.util.Util;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, Residente> residentes;
    private static Map<Integer, Habilidade> habilidades;
    public static final Logger customLogger = Util.setupLogger();
    
    public static void main(String[] args) {
        residentes = LeituraEscrita.lerResidentes();
        habilidades = LeituraEscrita.lerHabilidades();
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        while (true) {
        	Util.customizer();
            customLogger.log(Level.INFO, ()->"Menu Principal:");
            customLogger.log(Level.INFO, ()->"1. Relatório na Tela");
            customLogger.log(Level.INFO, ()->"2. Relatório Impresso");
            customLogger.log(Level.INFO, ()->"3. Sair");
            customLogger.log(Level.INFO, ()->"Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    exibirMenuRelatorioTela();
                    break;
                case 2:
                    exibirMenuRelatorioImpresso();
                    break;
                case 3:
                	customLogger.log(Level.INFO, ()->"Saindo do programa. Adeus!");
                    return;
                default:
                	customLogger.log(Level.INFO, ()->"Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenuRelatorioTela() {
        while (true) {
        	customLogger.log(Level.INFO, ()->"Relatório na Tela:");
        	customLogger.log(Level.INFO, ()->"1. Relatório de Residentes");
        	customLogger.log(Level.INFO, ()->"2. Relatório de Habilidades");
        	customLogger.log(Level.INFO, ()->"3. Voltar ao Menu Anterior");
        	customLogger.log(Level.INFO, ()->"Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    exibirRelatorioResidentes();
                    break;
                case 2:
                    exibirRelatorioHabilidades();
                    break;
                case 3:
                    return;
                default:
                	customLogger.log(Level.INFO, ()->"Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirRelatorioResidentes() {
    	customLogger.log(Level.INFO, ()->"Relatório de Residentes:");
        for (Residente residente : residentes.values()) {
            System.out.println(residente);
        }
    }

    private static void exibirRelatorioHabilidades() {
    	customLogger.log(Level.INFO, ()->"Relatório de Habilidades:");
        for (Habilidade habilidade : habilidades.values()) {
            System.out.println(habilidade);
        }
    }

    private static void exibirMenuRelatorioImpresso() {
        while (true) {
        	customLogger.log(Level.INFO, ()->"Relatório Impresso:");
        	customLogger.log(Level.INFO, ()->"1. Relatório Impresso 1");
        	customLogger.log(Level.INFO, ()->"2. Relatório Impresso 2");
        	customLogger.log(Level.INFO, ()->"3. Voltar ao Menu Anterior");
        	customLogger.log(Level.INFO, ()->"Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    gerarRelatorioImpresso1(residentes);
                    break;
                case 2:
                    gerarRelatorioImpresso2(habilidades);
                    break;
                case 3:
                    return;
                default:
                	customLogger.log(Level.INFO, ()->"Opção inválida. Tente novamente.");
            }
        }
    }

    private static void gerarRelatorioImpresso1(Map<Integer, Residente> residentes) {
        String caminhoArquivo = "temp/relatorio_impresso1.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            bw.write("Relatório Impresso 1 - Dados dos Residentes:");
            bw.newLine();
            for (Residente residente : residentes.values()) {
                bw.write(residente.toString());
                bw.newLine();
            }
            customLogger.log(Level.INFO, ()->"Relatório Impresso 1 gerado com sucesso!");
        } catch (IOException e) {
        	customLogger.log(Level.INFO, ()->"Erro ao gerar o Relatório Impresso 1.");
            e.printStackTrace();
        }
    }

    private static void gerarRelatorioImpresso2(Map<Integer, Habilidade> habilidades) {
        String caminhoArquivo = "temp/relatorio_impresso2.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            bw.write("Relatório Impresso 2 - Dados das Habilidades:");
            bw.newLine();
            for (Habilidade habilidade : habilidades.values()) {
                bw.write(habilidade.toString());
                bw.newLine();
            }
            customLogger.log(Level.INFO, ()->"Relatório Impresso 2 gerado com sucesso!");
        } catch (IOException e) {
        	customLogger.log(Level.INFO, ()->"Erro ao gerar o Relatório Impresso 2.");
            e.printStackTrace();
        }
    }
}
