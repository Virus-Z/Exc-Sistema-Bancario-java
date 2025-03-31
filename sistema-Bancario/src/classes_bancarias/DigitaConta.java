package classes_bancarias;

import java.util.Scanner;

public class DigitaConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        // Close the scanner
        scanner.close();
    }
}
