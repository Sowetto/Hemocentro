import Controller.CadastroController;
import View.CadastroView;

public class Main {
    public static void main(String[] args) {
        CadastroView view = new CadastroView();
        CadastroController controller = new CadastroController(view);

        boolean continuar = true;
        while (continuar) {
            view.exibirMensagem("\nMenu:");
            view.exibirMensagem("1 - Cadastrar Médico");
            view.exibirMensagem("2 - Cadastrar Paciente");
            view.exibirMensagem("3 - Listar Médicos");
            view.exibirMensagem("4 - Listar Pacientes");
            view.exibirMensagem("0 - Sair");
            int opcao = Integer.parseInt(view.obterEntrada("Escolha uma opção:"));

            switch (opcao) {
                case 1:
                    controller.cadastrarMedico();
                    break;
                case 2:
                    controller.cadastrarPaciente();
                    break;
                case 3:
                    controller.listarMedicos();
                    break;
                case 4:
                    controller.listarPacientes();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    view.exibirMensagem("Opção inválida.");
            }
        }
    }
}