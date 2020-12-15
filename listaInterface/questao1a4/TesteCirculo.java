
package q1;

import java.util.Scanner;


public class TesteCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo(0, 0);
        
        while (true) {
            System.out.println( "1. Digitar valor do raio e do PI\n" +
                                "2. Calcular Área\n" +
                                "3. Calcular Perímetro\n" +
                                "0. Sair");
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o valor do raio: ");
                    double raio = sc.nextInt();
                    System.out.println("Digite o valor de PI: ");
                    double PI = sc.nextInt();
                    
                    circulo.setRaio(raio);
                    circulo.setPI(PI);
                break;
                case 2:
                    System.out.println("Area: " + circulo.calcularArea());
                break;
                case 3:
                    System.out.println("Perimetro: " + circulo.calcularPerimetro());
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
}
