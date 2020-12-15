
package ex2;

import java.util.ArrayList;
import java.util.Scanner;


public class Teste {
    public static void main(String args[]) {
        ArrayList<CarbonFootprint> lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++) {
            System.out.println("Cadastrando casa\n");
            System.out.println("Número de pessoas: ");
            int numeroPessoas = sc.nextInt();
            
            System.out.println("Usa energia renovavel?: [S/N]");
            boolean energiaRenovavel = false;
            String resposta = sc.next();
            if(resposta.equals("S")) {
                energiaRenovavel = true;
            }
            
            System.out.println("Quantas lampadas na cidade: ");
            int numeroLampadas = sc.nextInt();
            
            System.out.println("Usa ar condicionado?: [S/N]");
            boolean arCondicionado = false;
            resposta = sc.next();
            if(resposta.equals("S")) {
                arCondicionado = true;
            }
            
            House h = new House(numeroPessoas, energiaRenovavel, numeroLampadas, arCondicionado);
            lista.add(h);
        }
        
        for(int i = 0; i < 2; i++) {
            System.out.println("Cadastrando escola\n");
            System.out.println("Número de pessoas: ");
            int numeroPessoas = sc.nextInt();
            
            System.out.println("Usa energia renovavel?: [S/N]");
            boolean energiaRenovavel = false;
            String resposta = sc.next();
            if(resposta.equals("S")) {
                energiaRenovavel = true;
            }
            
            System.out.println("Quantas lampadas na cidade: ");
            int numeroLampadas = sc.nextInt();
            
            System.out.println("Usa ar condicionado?: [S/N]");
            boolean arCondicionado = false;
            resposta = sc.next();
            if(resposta.equals("S")) {
                arCondicionado = true;
            }
            
            School s = new School(numeroPessoas, energiaRenovavel, numeroLampadas, arCondicionado);
            lista.add(s);
        }
        
        for(int i = 0; i < 2; i++) {
            System.out.println("Cadastrando carro\n");
            System.out.println("Combustivel: ");
            float combustivel = sc.nextFloat();
            
            System.out.println("Cilindradas: ");
            float cilindradas = sc.nextFloat();
            
            Car c = new Car(combustivel, cilindradas);
            lista.add(c);
        }
        
        for(int i = 0; i < 2; i++) {
            System.out.println("Cadastrando bicicleta\n");
            System.out.println("Qual o modelo?: ");
            String modelo = sc.next();
            
            System.out.println("Tem rodinha?: [S/N]");
            boolean rodinha = false;
            String resposta = sc.next();
            if(resposta.equals("S")) {
                rodinha = true;
            }
            
            Bicycle b = new Bicycle(modelo, rodinha);
            lista.add(b);
        }
        
        for(int i = 0; i < lista.size(); i++) {
            System.out.println("CarbonFootprint: " + lista.get(i).getCarbonFootprint());
        }
    }
}
