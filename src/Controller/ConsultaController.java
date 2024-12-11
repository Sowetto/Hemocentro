package Controller;
import Model.Consulta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsultaController {

    private static List<Consulta> consultasnew = new ArrayList<>();

    // Método para adicionar uma consulta
    public static void adicionarConsulta(Consulta consulta) {
        consultasnew.add(consulta);
        System.out.println("Consulta para " + consulta.getPaciente().getNome() + " adicionada com sucesso!");
    }

    // Método para deletar uma consulta baseado na data e paciente
    public static void deletarConsulta(Date dataHora, String nomePaciente) {
        Consulta consultaRemovida = null;

        // Buscando a consulta a ser removida
        for (Consulta consulta : consultasnew) {
            if (consulta.getDataHora().equals(dataHora) && consulta.getPaciente().getNome().equals(nomePaciente)) {
                consultaRemovida = consulta;
                break;
            }
        }

        // Removendo a consulta se encontrada
        if (consultaRemovida != null) {
            consultasnew.remove(consultaRemovida);
            System.out.println("Consulta para " + consultaRemovida.getPaciente().getNome() + " removida com sucesso!");
        } else {
            System.out.println("Consulta não encontrada para o paciente " + nomePaciente + " na data " + dataHora);
        }
    }

    // Método para buscar consulta de um paciente
    public static Consulta buscarConsulta(String nomePaciente) {
        for (Consulta consulta : consultasnew) {
            if (consulta.getPaciente().getNome().equals(nomePaciente)) {
                return consulta;
            }
        }
        return null; // Retorna null se não encontrar consulta
    }

    // Método para listar todas as consultas
    public static void listarConsultas() {
        if (consultasnew.isEmpty()) {
            System.out.println("Não há consultas registradas.");
        } else {
            for (Consulta consulta : consultasnew) {
                System.out.println("Consulta para " + consulta.getPaciente().getNome() +
                        " com o médico " + consulta.getMedico().getNome() +
                        " marcada para: " + consulta.getDataHora());
            }
        }
    }
}