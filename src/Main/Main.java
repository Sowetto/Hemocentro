package Main;

import View.View;
import View.ViewMedico;
import View.ViewPaciente;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ViewMedico viewMedico = new ViewMedico();
        ViewPaciente viewPaciente = new ViewPaciente();

        Boolean executaPrograma = Boolean.TRUE;

        while (executaPrograma.equals(Boolean.TRUE)) {
           int resposta = view.menuPrincipal();

           if (resposta == 1 || resposta == 2 || resposta == 3 || resposta == 4) {
               if (resposta == 1) {
                   view.cadastrarPaciente();
                   viewPaciente.exibirPacientes();
               }

               if (resposta == 2) {
                   view.cadastrarMedico();
                   viewMedico.exibirMedicos();
               }

               if (resposta == 4) {
                   executaPrograma = Boolean.FALSE;
               }

           } else {
               view.respostaIncorreta();
           }
        }
    }
}