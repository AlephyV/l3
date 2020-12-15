
package q5;


public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, String cpfCliente, double taxa, double saldo, String banco) {
        super(numeroConta, cpfCliente, taxa, saldo, banco);
    }

    @Override
    public void saque(double valor) {
        double TAXA = 0.3;
        double valorSaque = valor + TAXA;
        
        if(this.getSaldo() - valorSaque < 0) {
            System.out.println("Valor de saque + taxa de R$0,30 INDISPONIVEL\n");
        } else {
            double novoSaldo = this.getSaldo() - valorSaque;
            this.setSaldo(novoSaldo);
            System.out.println("Saque realizado com sucesso!\n");
        }
    }

    @Override
    public void atualizar() {
        double novoSaldo = this.getSaldo() - this.getTaxa();
        this.setSaldo(novoSaldo);
    }

    @Override
    public void deposito(double valor) {
        double novoSaldo = this.getSaldo() + valor;
        this.setSaldo(novoSaldo);
        System.out.println("Deposito realizado com sucesso!s");
    }
    
}
