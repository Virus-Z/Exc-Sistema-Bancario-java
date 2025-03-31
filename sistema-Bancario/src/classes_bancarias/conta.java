package classes_bancarias;

public class conta {

    int numeroConta;
    int numeroCliente;
    double saldo; // Changed to private
    String dataAbertura;

    void saqueConta(double valor){
        saldo = saldo - valor;
    }

    void depositoConta(double valor){
        saldo = saldo + valor;
    }

    conta(){
        saldo = 100.00;
    }

    // Method to get the current balance
    public double getSaldo() {
        return saldo;
    }
}
