public class ContaCorrente extends Conta {
    public ContaCorrente(int numero_conta, String cpf_cliente, double taxa, double saldo, String banco) {
        super(numero_conta, cpf_cliente, taxa, saldo, banco);
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
        System.out.println("Deposito realizado");
    }
    @Override
    public void saque(double valor) {
        double taxa = 0.3;
        double valorSaque = valor + taxa;
        
        if(this.getSaldo() - valorSaque < 0) {
            System.out.println("Valor de saque INDISPONIVEL\n");
        } else {
            double novoSaldo = this.getSaldo() - valorSaque;
            this.setSaldo(novoSaldo);
            System.out.println("Saque realizado\n");
        }
    }
}