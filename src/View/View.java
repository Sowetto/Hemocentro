package View;

import java.util.Scanner;
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

    public Paciente cadastrarPaciente() {
        System.out.print("Nome do Paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Data de nascimento do Paciente: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("CPF do Paciente: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço do Paciente: ");
        String endereco = scanner.nextLine();
        System.out.print("Histórico do Paciente: ");
        String historico = scanner.nextLine();
        System.out.print("Medicamento do Paciente: ");
        String medicamento = scanner.nextLine();
        System.out.print("Telefone do Paciente: ");
        int telefone = scanner.nextLine();
        return new Paciente(nome, cpf, dataNascimento, endereco, historico, medicamento, telefone);
    }

    public Medico cadastrarMedico() {
        System.out.print("CRM do Médico: ");
        int crm = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha
        System.out.print("Nome do Médico: ");
        String nome = scanner.nextLine();
        System.out.print("Especialidade do Médico: ");
        String especialidade = scanner.nextLine();
        System.out.print("CPF do Médico: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone do Médico: ");
        int telefone = scanner.nextLine();
        System.out.print("E-mail do Médico: ");
        String email = scanner.nextLine();
        return new Medico(crm, nome, especialidade, cpf, telefone, email);
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