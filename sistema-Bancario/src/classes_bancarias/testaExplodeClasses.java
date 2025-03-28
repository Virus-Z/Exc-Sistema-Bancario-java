package classes_bancarias;
public class testaExplodeClasses {
    public static void main(String[] args) {
        contaPoupanca cp = new contaPoupanca(); // Objeto para conta poupança
        cp.saqueConta(30.00);
        System.out.println("Saldo em Poupança:" + cp.saldo);

        contaCorrente cr = new contaCorrente(); // Objeto cr para conta corrente
        cr.saqueConta(500.00);
        System.out.println("Saldo em Conta Corrente:" + cr.saldo);
    }
}
// classe teste para verificar o funcionamento das classes contaCorrente e contaPoupanca
