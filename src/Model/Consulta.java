package Model;
import java.util.Date;

public class Consulta {
    private Date dataHora;
    private Medico medico;
    private Paciente paciente;
    private String diagnostico;
    private Medicamento medicamento;

    public Consulta(Date dataHora, Medico medico, Paciente paciente, String diagnostico, Medicamento medicamento) {
        this.dataHora = dataHora;
        this.medico = medico;
        this.paciente = paciente;
        this.diagnostico = diagnostico;
        this.medicamento = medicamento;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}