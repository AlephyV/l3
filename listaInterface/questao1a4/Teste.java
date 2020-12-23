import java.util.ArrayList;
import java.util.Scanner;
public  class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<ObjetoGeometrico> lista_objetos = new ArrayList();
        while (true) {
            System.out.println("1. Adicionar um Círculo;\n2. Adicionar um Retângulo;\n3. Calcular média das áreas;\n" +
                                "4. Calcular média dos perímetros;\n" +
                                "0. Sair");
            
            int opcao = teclado.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("valor do raio: ");
                    double raio = teclado.nextInt();
                    System.out.println("valor de PI: ");
                    double PI  = teclado.nextInt();
                    Circulo circulo = new Circulo(raio, PI);
                    lista_objetos.add(circulo);
                break;
                case 2:
                    System.out.println("valor da base: ");
                    int base = teclado.nextInt();
                    System.out.println("valor da altura: ");
                    int altura = teclado.nextInt();
                    Retangulo retangulo = new Retangulo(base, altura);
                    lista_objetos.add(retangulo);
                break;
                case 3:
                    Teste.calcularMediaAreas(lista_objetos);
                break;
                case 4:
                    Teste.calcularMediaPerimetros(lista_objetos);
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
    static void calcularMediaPerimetros(ArrayList<ObjetoGeometrico> objetos) {
        double soma = 0;
        int size = objetos.size();
        for(int i = 0; i < size; i++) {
            soma += objetos.get(i).calcularPerimetro();
        }
        double media = soma / size;
        System.out.println("A média é de: " + media);
    }
    static void calcularMediaAreas(ArrayList<ObjetoGeometrico> objetos) {
        double soma = 0;
        int size = objetos.size();
        for(int i = 0; i < size; i++) {
            soma += objetos.get(i).calcularArea();
        }
        double media = soma / size;
        System.out.println("A média é de: " + media);
    }
}