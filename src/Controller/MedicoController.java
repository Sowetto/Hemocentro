package Controller;
import Model.Medico;

import java.util.ArrayList;
import java.util.List;

public class MedicoController {

    private static List<Medico> medicosnew = new ArrayList<>();

    //Método para adicionar um médico
    public static void adicionarMedico(Medico medico) {
        medicosnew.add(medico);
    }

    // Método para deletar um médico baseado no CRM
    public void deletarMedico(String crm) {
        Medico medicoRemovido = null;
        for (Medico medico : medicosnew) {
            if (medico.getCrm().equals(crm)) {
                medicoRemovido = medico;
                break;
            }
        }

        if (medicoRemovido != null) {
            medicosnew.remove(medicoRemovido);
            System.out.println("Médico " + medicoRemovido.getNome() + " removido com sucesso!");
        } else {
            System.out.println("Médico com CRM " + crm + " não encontrado.");
        }
    }

    //Retorna lista de Array dos medicos salvos
    public static List<Medico> retornaList(){
        return medicosnew;
    }
}