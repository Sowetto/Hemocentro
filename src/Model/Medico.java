package Model;

public class Medico extends Pessoa {

    private String CRM;
    private String dataNascimento;
    private String endereco;
    private String CPF;
    private String email;
    private String nome;
    private int telefone;

    public Medico(String nome, int idade, String email, String CPF, String dataNascimento, String CRM, String endereco, String CPF1, String email1, String nome1, int telefone) {
        super(nome, idade, email, CPF);
        this.dataNascimento = dataNascimento;
        this.CRM = CRM;
        this.endereco = endereco;
        this.CPF = CPF1;
        this.email = email1;
        this.nome = nome1;
        this.telefone = telefone;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
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

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    private String toString ()
}

