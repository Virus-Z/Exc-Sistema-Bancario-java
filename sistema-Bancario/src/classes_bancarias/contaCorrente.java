package classes_bancarias;

public class contaCorrente extends conta {
    
    double limiteOverdraft; // Overdraft limit

    public contaCorrente(double limiteOverdraft) {
        this.limiteOverdraft = limiteOverdraft;
    }

    @Override
    void saqueConta(double valor) {
        if ((saldo - valor) < -limiteOverdraft) {
            System.out.println("ERRO: Saldo ficará abaixo do limite de overdraft.");
        } else {
            saldo = saldo - valor;
        }
    }
}
