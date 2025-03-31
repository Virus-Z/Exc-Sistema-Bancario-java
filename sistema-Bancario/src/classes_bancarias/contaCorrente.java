package classes_bancarias;

public class contaCorrente extends conta {
    
    double limiteCredito; // Overdraft limit

    public contaCorrente(double limiteOverdraft) {
        this.limiteCredito = limiteOverdraft;
    }

    @Override
    void saqueConta(double valor) {
        if ((saldo - valor) < -limiteCredito) {
            System.out.println("ERRO: Saldo ficará abaixo do limite de overdraft.");
        } else {
            saldo = saldo - valor;
        }
    }
}
