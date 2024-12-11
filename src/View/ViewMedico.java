package View;

import Model.Medico;

import static Controller.MedicoController.*;

public class ViewMedico {

    // Método para exibir todos os médicos
    public void exibirMedicos() {
        if (retornaList().isEmpty()) {
            System.out.println("Nenhum médico cadastrado.");
            return;
        }else{
        System.out.println("Lista de Médicos:");
        for (Medico medico : retornaList()) {
            System.out.println("Nome: " + medico.getNome());
            System.out.println("CRM: " + medico.getCrm());
            System.out.println("Especialidade: " + medico.getEspecialidade());
            System.out.println("Email: " + medico.getEmail());
            System.out.println("Telefone: " + medico.getTelefone());
            System.out.println("------------------------------");
            }
        }
    }
}