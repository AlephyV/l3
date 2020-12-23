import java.util.Scanner;
public class TesteRetangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Retangulo retangulo = new Retangulo(0, 0);
        while (true) {
            System.out.println( "1. Digitar valor de base e altura\n2. Calcular Área\n3. Calcular Perímetro\n" +
                                "0. Sair");
            int escolha = teclado.nextInt();
            switch(escolha) {
                case 1:
                    System.out.println("valor da base: ");
                    int base = teclado.nextInt();
                    System.out.println("valor da altura: ");
                    int altura = teclado.nextInt();
                    retangulo.setBase(base);
                    retangulo.setAltura(altura);
                break;
                case 2:
                    System.out.println("Área: " + retangulo.calcularArea());
                break;
                case 3:
                    System.out.println("Perímetro: " + retangulo.calcularPerimetro());
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
}