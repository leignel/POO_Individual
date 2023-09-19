package br.com.poo.individual;

public class Residente {
    private int idResidente;
    private String nomeResidente;
    private String email;
    private String matricula;

    public Residente(int idResidente, String nomeResidente, String email, String matricula) {
        this.idResidente = idResidente;
        this.nomeResidente = nomeResidente;
        this.email = email;
        this.matricula = matricula;
    }

 

    public int getIdResidente() {
        return idResidente;
    }

    public void setIdResidente(int idResidente) {
        this.idResidente = idResidente;
    }

    public String getNomeResidente() {
        return nomeResidente;
    }

    public void setNomeResidente(String nomeResidente) {
        this.nomeResidente = nomeResidente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "ID: " + idResidente + ", Nome: " + nomeResidente + ", Email: " + email + ", Matrícula: " + matricula;
    }
}