package View;
import Model.Medico;
import Model.Paciente;

import java.util.Scanner;

public class ViewCadastro {
    private Scanner scanner;

    public ViewCadastro() {
        scanner = new Scanner(System.in);
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public String obterEntrada(String mensagem) {
        exibirMensagem(mensagem);
        return scanner.nextLine();
    }

    public Medico obterCadastro() {
        String nome = obterEntrada("Digite o nome do médico:");
        String cpf = obterEntrada("Digite o CPF do médico:");
        String especialidade = obterEntrada("Digite a especialidade do médico:");
        String idade = obterEntrada("Digite a idade do médico:");
        String email = obterEntrada("Digite o e-mail do médico:");
        String telefone = obterEntrada("Digite o telefone do médico:");
        String CRM = obterEntrada("Digite o CRM do médico:");
        return new Medico(nome, idade, especialidade, email, telefone, cpf, CRM);
    }

        public Paciente obterCadastro() {
            String nome = obterEntrada("Digite o nome do paciente:");
            String cpf = obterEntrada("Digite o CPF do paciente:");
            String endereco = obterEntrada ("Digite a endereco do paciente:");
            String idade = obterEntrada ("Digite a idade do paciente:");
            String email = obterEntrada ("Digite o e-mail do paciente:");
            String telefone = obterEntrada ("Digite o telefone do paciente:");
            String dataNascimento = obterEntrada ("Digite a data de nascimento do paciente:");
            return new Paciente(nome, idade, telefone, cpf, endereco, email, dataNascimento);
    }
}