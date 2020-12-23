public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero_conta, String cpf_cliente, double taxa, double saldo, String banco) {
        super(numero_conta, cpf_cliente, taxa, saldo, banco);
    }
    @Override
    public void deposito(double valor) {
        double novoSaldo = this.getSaldo() + valor;
        this.setSaldo(novoSaldo);
        System.out.println("Deposito realizado");
    }
    @Override
    public void saque(double valor) {
        
        if(this.getSaldo() - valor < 0) {
            System.out.println("Valor de saque nao disponivel\n");
        } else {
            double novoSaldo = this.getSaldo() - valor;
            this.setSaldo(novoSaldo);
            System.out.println("Saque realizado\n");
        }
    }
    @Override
    public void atualizar() {
        double novoSaldo = this.getSaldo() + this.getTaxa();
        this.setSaldo(novoSaldo);
    }
}