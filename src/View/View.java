package View;

import java.util.Scanner;

import Controller.MedicoController;
import Controller.PacienteController;
import Model.Medico;
import Model.Paciente;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public int menuPrincipal() {
        System.out.println("1. Cadastrar Paciente");
        System.out.println("2. Cadastrar Médico");
        System.out.println("3. Agendar Consulta");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public void respostaIncorreta() {
        System.out.println("Resposta Incorreta, selecione novamente!");
    }

    public void cadastrarPaciente() {
        System.out.print("Nome do Paciente: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do Paciente: ");
        String cpf = scanner.nextLine();
        scanner.nextLine(); // Consumir nova linha
        System.out.print("Data de nascimento do Paciente: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("E-mail do Paciente: ");
        String email = scanner.nextLine();
        System.out.print("Endereço do Paciente: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone do Paciente: ");
        String telefone = scanner.nextLine();
        scanner.nextLine();

        Paciente paciente = new Paciente(nome, cpf, dataNascimento, email, endereco, telefone);
        PacienteController.adicionarPaciente(paciente);
    }

    public void cadastrarMedico() {
        System.out.print("Nome do Médico: ");
        String nome = scanner.nextLine();
        System.out.print("CRM do Médico: ");
        String crm = scanner.nextLine();
        scanner.nextLine(); // Consumir nova linha
        System.out.print("Especialidade do Médico: ");
        String especialidade = scanner.nextLine();
        System.out.print("E-mail do Médico: ");
        String email = scanner.nextLine();
        System.out.print("Telefone do Médico: ");
        String telefone = scanner.nextLine();

        Medico medico = new Medico(nome, especialidade, crm, email, telefone);
        MedicoController.adicionarMedico(medico);
    }

    public int selecionarPaciente() {
        System.out.print("CPF do Paciente: ");
        return scanner.nextInt();
    }

    public int selecionarMedico() {
        System.out.print("CRM do Médico: ");
        return scanner.nextInt();
    }

    public String selecionarDataHora() {
        System.out.print("Data e Hora da Consulta (yyyy-MM-ddTHH:mm): ");
        return scanner.next();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}