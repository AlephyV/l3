import java.util.Scanner;
public class TesteCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Circulo circulo = new Circulo(0, 0);
        while (true) {
            System.out.println( "1. Digitar valor do raio e do PI\n2. Calcular Área\n" +
                                "3. Calcular Perímetro\n" +
                                "0. Sair");
            int escolha = teclado.nextInt();
            switch(escolha) {
                case 1:
                    System.out.println("valor do raio: ");
                    double raio = teclado.nextInt();
                    System.out.println("valor de PI: ");
                    double PI = teclado.nextInt();
                    circulo.setPI(PI);
                    circulo.setRaio(raio);
                break;
                case 2:
                    System.out.println("Área: " + circulo.calcularArea());
                break;
                case 3:
                    System.out.println("Perímetro: " + circulo.calcularPerimetro());
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
}