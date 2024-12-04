package Model;

public class Paciente extends Pessoa {
    private String dataNascimento;
    private String endereco;
    private String historico;
    private String medicamento;

    public Paciente(String nome, String email, String cpf, int telefone, String dataNascimento, String endereco, String historico, String medicamento) {
        super(nome, email, cpf, telefone);
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.historico = historico;
        this.medicamento = medicamento;
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

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
}