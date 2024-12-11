package Controller;
import Model.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteController {

    private static List<Paciente> pacientesnew = new ArrayList<>();

    // Método para adicionar um paciente
    public static void adicionarPaciente(Paciente paciente) {
        pacientesnew.add(paciente);
    }

    // Método para deletar um paciente baseado no CPF
    public void deletarPaciente(String cpf) {
        Paciente pacienteRemovido = null;
        for (Paciente paciente : pacientesnew) {
            if (paciente.getCpf().equals(cpf)) {
                pacienteRemovido = paciente;
                break;
            }
        }

        if (pacienteRemovido != null) {
            pacientesnew.remove(pacienteRemovido);
            System.out.println("Paciente " + pacienteRemovido.getNome() + " removido com sucesso!");
        } else {
            System.out.println("Paciente com CPF " + cpf + " não encontrado.");
        }
    }

    //Retorna lista de Array dos pacientes salvos
    public static List<Paciente> retornaList(){
        return pacientesnew;
    }
}