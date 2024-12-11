package Controller;
import Model.Medico;

import java.util.ArrayList;
import java.util.List;

public class MedicoController {
    private List<Medico> medicos;

    // Construtor
    public MedicoController() {
        this.medicos = new ArrayList<>();
    }

    //Método para adicionar um médico

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
        System.out.println("Médico " + medico.getNome() + " adicionado com sucesso!");
    }

    // Método para exibir todos os médicos
    public void exibirMedicos() {
        if (medicos.isEmpty()) {
            System.out.println("Nenhum médico cadastrado.");
            return;
        }
        System.out.println("Lista de Médicos:");
        for (Medico medico : medicos) {
            System.out.println("Nome: " + medico.getNome());
            System.out.println("Especialidade: " + medico.getEspecialidade());
            System.out.println("CRM: " + medico.getCrm());
            System.out.println("Email: " + medico.getEmail());
            System.out.println("Telefone: " + medico.getTelefone());
            System.out.println("------------------------------");
        }
    }

    // Método para deletar um médico baseado no CRM
    public void deletarMedico(String crm) {
        Medico medicoRemovido = null;
        for (Medico medico : medicos) {
            if (medico.getCrm().equals(crm)) {
                medicoRemovido = medico;
                break;
            }
        }

        if (medicoRemovido != null) {
            medicos.remove(medicoRemovido);
            System.out.println("Médico " + medicoRemovido.getNome() + " removido com sucesso!");
        } else {
            System.out.println("Médico com CRM " + crm + " não encontrado.");
        }
    }
}
