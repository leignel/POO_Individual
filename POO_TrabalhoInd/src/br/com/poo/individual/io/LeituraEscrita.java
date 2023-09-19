package br.com.poo.individual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.poo.individual.Habilidade;
import br.com.poo.individual.Residente;

public class LeituraEscrita {
    private static final String CAMINHO_ARQUIVO_BANCO = "temp/banco.txt"; // Caminho para o arquivo

    public static Map<Integer, Residente> lerResidentes() {
        Map<Integer, Residente> residentes = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO_ARQUIVO_BANCO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length >= 4) {
                    int id = Integer.parseInt(partes[0]);
                    String nome = partes[1];
                    String email = partes[2];
                    String matricula = partes[3];
                    Residente residente = new Residente(id, nome, email, matricula);
                    residentes.put(id, residente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return residentes;
    }

    public static Map<Integer, Habilidade> lerHabilidades() {
        Map<Integer, Habilidade> habilidades = new HashMap<>();
        int idHabilidade = 1; 
        boolean leituraHabilidades = false; 
        try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO_ARQUIVO_BANCO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (leituraHabilidades) {
                    String[] partes = linha.split(";");
                    if (partes.length >= 2) {
                        String nomeHabilidade = partes[1].trim(); 
                        Habilidade habilidade = new Habilidade(idHabilidade, nomeHabilidade);
                        habilidades.put(idHabilidade, habilidade);
                        idHabilidade++;
                    }
                }
                if (linha.equals("1; Lógica de Programação;")) {
                    leituraHabilidades = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return habilidades;
    }

    public static void escreverResidentes(Map<Integer, Residente> residentes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO_BANCO))) {
            for (Residente residente : residentes.values()) {
                bw.write(residente.getIdResidente() + ";" + residente.getNomeResidente() + ";" +
                        residente.getEmail() + ";" + residente.getMatricula());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escreverHabilidades(Map<Integer, Habilidade> habilidades) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO_BANCO, true))) {
            bw.newLine(); 
            for (Habilidade habilidade : habilidades.values()) {
                bw.write(habilidade.getNomeHabilidade());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
