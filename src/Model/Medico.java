package Model;

public class Medico extends Pessoa {
    private String CRM;
    private String especialidade;

    public Medico(String nome, String email, String cpf, int telefone, String CRM, String especialidade) {
        super(nome, email, cpf, telefone);
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