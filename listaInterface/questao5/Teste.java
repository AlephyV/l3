
package q5;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente contaCorrente = null;
        ContaPoupanca contaPoupanca = null;
        
        while (true) {
            System.out.println("1. Cadastrar Conta corrente\n" +
                            "2. Cadastrar Poupança\n" +
                            "3. Atualizar conta corrente\n" +
                            "4. Atualizar poupança\n" +
                            "5. Saque conta corrente\n" +
                            "6. Saque poupança\n" +
                            "7. Verificar saldo de conta corrente\n" +
                            "8. Verificar saldo de poupança\n" +
                            "0. Sair");
            int opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Número da conta: ");
                    int numeroConta = sc.nextInt();
                    
                    System.out.println("Cpf do cliente: ");
                    String cpfCliente = sc.next();
                    
                    System.out.println("Taxa: ");
                    double taxa = sc.nextDouble();
                    
                    System.out.println("Saldo: ");
                    double saldo = sc.nextDouble();
                    
                    System.out.println("Banco (sem espaço): ");
                    String banco = sc.next();
                    
                    contaCorrente = new ContaCorrente(numeroConta, cpfCliente, taxa, saldo, banco);
                break;
                case 2:
                    System.out.println("Número da conta: ");
                    numeroConta = sc.nextInt();
                    
                    System.out.println("Cpf do cliente: ");
                    cpfCliente = sc.next();
                    
                    System.out.println("Taxa: ");
                    taxa = sc.nextDouble();
                    
                    System.out.println("Saldo: ");
                    saldo = sc.nextDouble();
                    
                    System.out.println("Banco (sem espaço): ");
                    banco = sc.next();
                    
                    contaPoupanca = new ContaPoupanca(numeroConta, cpfCliente, taxa, saldo, banco);
                break;
                case 3:
                    contaCorrente.atualizar();
                    System.out.println("CONTA CORRENTE ATUALIZADA");
                break;
                case 4:
                    contaPoupanca.atualizar();
                    System.out.println("CONTA POUPANÇA ATUALIZADA");
                break;
                case 5:
                    System.out.println("Digite o valor do saque: ");
                    double valor = sc.nextDouble();
                    
                    contaCorrente.saque(valor);
                break;
                case 6:
                    System.out.println("Digite o valor do saque: ");
                    valor = sc.nextDouble();
                    
                    contaPoupanca.saque(valor);
                break;
                case 7:
                    System.out.println("Saldo da conta corrente: R$" + contaCorrente.getSaldo());
                break;
                case 8:
                    System.out.println("Saldo da conta poupança: R$" + contaPoupanca.getSaldo());
                break;
                default:
                    System.exit(0);
                break;
            }
            
        }
        
    }
}
