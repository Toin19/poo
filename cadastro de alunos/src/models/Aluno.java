package models;
public class Aluno {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        if (matricula.length() != 10) {
            throw new IllegalArgumentException("A matrícula deve ter 10 números");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula.length() != 10) {
            throw new IllegalArgumentException("A matrícula deve ter 10 números");
        }
        this.matricula = matricula;
    }
}
