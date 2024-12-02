package Model;

public class Paciente extends Pessoa {
    private String dataNascimento;
    private String endereco;

    public Paciente(String nome, int idade, String email, int telefone, String cpf, String dataNascimento, String endereco) {
        super(nome, idade, email, telefone, cpf);
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}