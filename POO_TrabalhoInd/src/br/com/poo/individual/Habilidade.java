package br.com.poo.individual;

public class Habilidade {
    private int idHabilidade;
    private String nomeHabilidade;

    public Habilidade(int idHabilidade, String nomeHabilidade) {
        this.idHabilidade = idHabilidade;
        this.nomeHabilidade = nomeHabilidade;
    }

  

    public int getIdHabilidade() {
        return idHabilidade;
    }

    public void setIdHabilidade(int idHabilidade) {
        this.idHabilidade = idHabilidade;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    @Override
    public String toString() {
        return "ID: " + idHabilidade + ", Habilidade: " + nomeHabilidade;
    }
}
