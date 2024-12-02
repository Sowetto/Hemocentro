package Model;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String CPF;

   //Construtor
    public Pessoa(String nome, int idade, String email, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.CPF = CPF;
    }

    //Getters e Setters
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}

