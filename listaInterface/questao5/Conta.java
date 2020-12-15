
package q5;


public abstract class Conta {
    private int numeroConta;
    private String cpfCliente;
    private double taxa;
    private double saldo;
    private String banco;

    public Conta(int numeroConta, String cpfCliente, double taxa, double saldo, String banco) {
        this.numeroConta = numeroConta;
        this.cpfCliente = cpfCliente;
        this.taxa = taxa;
        this.saldo = saldo;
        this.banco = banco;
    }
    
    public abstract void saque(double valor);
    public abstract void atualizar();
    public abstract void deposito(double valor);

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}
