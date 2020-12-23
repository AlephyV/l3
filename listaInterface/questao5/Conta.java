public abstract class Conta {
    private int numero_conta;
    private String cpf_cliente;
    private double taxa;
    private double saldo;
    private String banco;
    public Conta(int numero_conta, String cpf_cliente, double taxa, double saldo, String banco) {
        this.taxa = taxa;
        this.saldo = saldo;
        this.banco = banco;
        this.numero_conta = numero_conta;
        this.cpf_cliente = cpf_cliente;
    }
    public abstract void deposito(double valor);
    public abstract void saque(double valor);
    public abstract void atualizar();
    public int getNumeroConta() {
        return numero_conta;
    }
    public void setNumeroConta(int numero_conta) {
        this.numero_conta = numero_conta;
    }
    public String getCpfCliente() {
        return cpf_cliente;
    }
    public void setCpfCliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public double getTaxa() {
        return taxa;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public double getSaldo() {
        return saldo;
    }
}