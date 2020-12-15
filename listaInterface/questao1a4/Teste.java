
package q1;

import java.util.ArrayList;
import java.util.Scanner;


public  class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ObjetoGeometrico> lista = new ArrayList();
        
        while (true) {
            System.out.println("1. Adicionar um Círculo;\n" +
                                "2. Adicionar um Retângulo;\n" +
                                "3. Calcular média das áreas;\n" +
                                "4. Calcular média dos perímetros;\n" +
                                "0. Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o valor do raio: ");
                    double raio = sc.nextInt();
                    System.out.println("Digite o valor de PI: ");
                    double PI  = sc.nextInt();
                    
                    Circulo circulo = new Circulo(raio, PI);
                    lista.add(circulo);
                break;
                case 2:
                    System.out.println("Digite o valor da base: ");
                    int base = sc.nextInt();
                    
                    System.out.println("Digite o valor da altura: ");
                    int altura = sc.nextInt();
                    
                    Retangulo retangulo = new Retangulo(base, altura);
                    lista.add(retangulo);
                break;
                case 3:
                    Teste.calcularMediaAreas(lista);
                break;
                case 4:
                    Teste.calcularMediaPerimetros(lista);
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
    
    static void calcularMediaAreas(ArrayList<ObjetoGeometrico> objetos) {
        double soma = 0;
        int size = objetos.size();
        
        for(int i = 0; i < size; i++) {
            soma += objetos.get(i).calcularArea();
        }
        
        double media = soma / size;
        
        System.out.println("A média das áreas é de: " + media);
    }
    
    static void calcularMediaPerimetros(ArrayList<ObjetoGeometrico> objetos) {
        double soma = 0;
        int size = objetos.size();
        
        for(int i = 0; i < size; i++) {
            soma += objetos.get(i).calcularPerimetro();
        }
        
        double media = soma / size;
        
        System.out.println("A média dos perimetros é de: " + media);
    }
}
