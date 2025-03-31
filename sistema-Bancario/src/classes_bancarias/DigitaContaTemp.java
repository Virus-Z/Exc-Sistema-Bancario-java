package classes_bancarias;

import java.util.Scanner;

public class DigitaContaTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar uma conta Poupança");
            System.out.println("2 - Cadastrar uma conta Corrente");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    cadastrarContaPoupanca(scanner);
                    break;
                case 2:
                    cadastrarContaCorrente(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void cadastrarContaPoupanca(Scanner scanner) {
        // Prompt for conta attributes
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o número do cliente: ");
        int numeroCliente = scanner.nextInt();

        System.out.print("Digite a data de abertura: ");
        String dataAbertura = scanner.next();

        // Prompt for contaPoupanca attribute
        System.out.print("Digite a data de aniversários: ");
        String datasAniversários = scanner.next();

        // Create an instance of contaPoupanca
        contaPoupanca contaPoupanca = new contaPoupanca();
        contaPoupanca.numeroConta = numeroConta;
        contaPoupanca.numeroCliente = numeroCliente;
        contaPoupanca.dataAbertura = dataAbertura;
        contaPoupanca.datasAniversários = datasAniversários;

        // Display the entered values
        System.out.println("Conta Poupança criada com sucesso!");
        System.out.println("Número da Conta: " + contaPoupanca.numeroConta);
        System.out.println("Número do Cliente: " + contaPoupanca.numeroCliente);
        System.out.println("Saldo: " + contaPoupanca.saldo);
        System.out.println("Data de Abertura: " + contaPoupanca.dataAbertura);
        System.out.println("Datas de Aniversários: " + contaPoupanca.datasAniversários);
    }

    private static void cadastrarContaCorrente(Scanner scanner) {
        // Prompt for conta attributes
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o número do cliente: ");
        int numeroCliente = scanner.nextInt();

        System.out.print("Digite a data de abertura: ");
        String dataAbertura = scanner.next();

        // Prompt for overdraft limit
        System.out.print("Digite o limite de overdraft: ");
        double limiteOverdraft = scanner.nextDouble();

        // Create an instance of contaCorrente
        contaCorrente contaCorrente = new contaCorrente(limiteOverdraft);
        contaCorrente.numeroConta = numeroConta;
        contaCorrente.numeroCliente = numeroCliente;
        contaCorrente.dataAbertura = dataAbertura;

        // Display the entered values
        System.out.println("Conta Corrente criada com sucesso!");
        System.out.println("Número da Conta: " + contaCorrente.numeroConta);
        System.out.println("Número do Cliente: " + contaCorrente.numeroCliente);
        System.out.println("Saldo: " + contaCorrente.saldo);
        System.out.println("Data de Abertura: " + contaCorrente.dataAbertura);
    }
}
