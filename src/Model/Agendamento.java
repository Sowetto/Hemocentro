package Model;

public class Agendamento {
    private String data;
    private String hora;
    private String medico;

    public Agendamento(){

    }

    public Agendamento(String data, String hora, String medico) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
}
