package Model;

public class Medico extends Pessoa {
    private String CRM;
    private String especialidade;

    public Medico(String nome, int idade, String email, int telefone, String cpf, String CRM, String especialidade) {
        super(nome, idade, email, telefone, cpf);
        this.CRM = CRM;
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}