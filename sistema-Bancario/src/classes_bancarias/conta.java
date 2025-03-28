package classes_bancarias;

public class conta {

    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;

    void saqueConta(double valor){
        saldo = saldo - valor;
    }

    void depositoConta(double valor){
        saldo = saldo + valor;
    }

    conta(){
        saldo=100.00;
    }
}
// classe conta com atributos e métodos para saque e depósito