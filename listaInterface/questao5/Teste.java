import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaCorrente conta_corrente = null;
        ContaPoupanca conta_poupanca = null;
        while (true) {
            System.out.println("1. Cadastrar Conta corrente\n2. Cadastrar Poupança\n3. Atualizar conta corrente\n4. Atualizar poupança\n5. Saque conta corrente\n" +
                            "6. Saque poupança\n" +
                            "7. Verificar saldo de conta corrente\n" +
                            "8. Verificar saldo de poupança\n" +
                            "0. Sair");
            int escolha = teclado.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Número conta: ");
                    int numero_conta = teclado.nextInt();
                    System.out.println("Cpf: ");
                    String cpf_cliente = teclado.next();
                    System.out.println("Taxa: ");
                    double taxa = teclado.nextDouble();
                    System.out.println("Saldo: ");
                    double saldo = teclado.nextDouble();
                    System.out.println("Banco: ");
                    String banco = teclado.next();
                    conta_corrente = new ContaCorrente(numero_conta, cpf_cliente, taxa, saldo, banco);
                break;
                case 2:
                    System.out.println("Número conta: ");
                    numero_conta = teclado.nextInt();
                    System.out.println("Cpf cliente: ");
                    cpf_cliente = teclado.next();
                    System.out.println("Taxa: ");
                    taxa = teclado.nextDouble();
                    System.out.println("Saldo: ");
                    saldo = teclado.nextDouble();
                    System.out.println("Banco: ");
                    banco = teclado.next();
                    conta_poupanca = new ContaPoupanca(numero_conta, cpf_cliente, taxa, saldo, banco);
                break;
                case 3:
                    conta_corrente.atualizar();
                    System.out.println("conta corrente atualizada");
                break;
                case 4:
                    conta_poupanca.atualizar();
                    System.out.println("conta poupança atualizada");
                break;
                case 5:
                    System.out.println("valor do saque: ");
                    double valor = teclado.nextDouble();
                    conta_corrente.saque(valor);
                break;
                case 6:
                    System.out.println("valor do saque: ");
                    valor = teclado.nextDouble();
                    conta_poupanca.saque(valor);
                break;
                case 7:
                    System.out.println("Saldo conta corrente:" + conta_corrente.getSaldo());
                break;
                case 8:
                    System.out.println("Saldo conta poupança:" + conta_poupanca.getSaldo());
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
}