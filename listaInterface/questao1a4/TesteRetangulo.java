
package q1;

import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo(0, 0);
        
        while (true) {
            System.out.println( "1. Digitar valor de base e altura\n" +
                                "2. Calcular Área\n" +
                                "3. Calcular Perímetro\n" +
                                "0. Sair");
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o valor da base: ");
                    int base = sc.nextInt();
                    
                    System.out.println("Digite o valor da altura: ");
                    int altura = sc.nextInt();
                    
                    retangulo.setBase(base);
                    retangulo.setAltura(altura);
                break;
                case 2:
                    System.out.println("Area: " + retangulo.calcularArea());
                break;
                case 3:
                    System.out.println("Perimetro: " + retangulo.calcularPerimetro());
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
}
