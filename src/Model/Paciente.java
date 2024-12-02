package Model;

public class Paciente extends Pessoa {
    private String dataNascimento;
    private String endereco;
    private String CPF;
    private String email;
    private String nome;
    private int telefone;

//Construtor
    public Paciente(String nome, int idade, String email, String CPF, String endereco, String CPF1, String dataNascimento, String email1, String nome1, int telefone) {
        super(nome, idade, email, CPF);
        this.endereco = endereco;
        this.CPF = CPF1;
        this.dataNascimento = dataNascimento;
        this.email = email1;
        this.nome = nome1;
        this.telefone = telefone;
    }

}
