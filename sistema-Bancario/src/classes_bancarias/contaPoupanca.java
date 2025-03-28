package classes_bancarias;

public class contaPoupanca extends conta {
    
    String datasAniversários;
    void saqueConta(double valor) {
        if ((saldo - valor) < 0)
            System.out.println(" ERRO: Saldo ficará abaixo de 0.00 ");
        else
            saldo = saldo - valor;
    }
}

// classe contaPoupanca que herda da classe conta e sobrescreve o método saqueConta