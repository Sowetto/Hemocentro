package View;

import Model.Paciente;

import static Controller.PacienteController.*;

public class ViewPaciente {

    // Método para exibir todos os médicos
    public void exibirPacientes() {
        if (retornaList().isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        } else {
            System.out.println("Lista de Pacientes:");
            for ( Paciente paciente : retornaList()) {
                System.out.println("Nome: " + paciente.getNome());
                System.out.println("CPF: " + paciente.getCpf());
                System.out.println("Data de Nascimento: " + paciente.getDataNascimento());
                System.out.println("Email: " + paciente.getEmail());
                System.out.println("Endereço: " + paciente.getEndereco());
                System.out.println("Telefone: " + paciente.getTelefone());
                System.out.println("------------------------------");
            }
        }
    }
}