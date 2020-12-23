import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
    public static void main(String args[]) {
        ArrayList<CarbonFootprint> lista_carbonfootprint = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 2; i++) {
            System.out.println("Número de pessoas: ");
            int quantidade_pessoas = teclado.nextInt();
            System.out.println("Usa energia renovavel?: [S/N]");
            boolean energia_renovavel = false;
            String resposta = teclado.next();
            if(resposta.equals("S")) {
                energia_renovavel = true;
            }
            System.out.println("Quantas lampadas na cidade: ");
            int quantidade_lampadas = teclado.nextInt();
            
            System.out.println("Usa ar condicionado?: [S/N]");
            boolean arCondicionado = false;
            resposta = teclado.next();
            if(resposta.equals("S")) {
                arCondicionado = true;
            }
            House h = new House(quantidade_pessoas, energia_renovavel, quantidade_lampadas, arCondicionado);
            lista_carbonfootprint.add(h);
        }
        for(int i = 0; i < 2; i++) {
            System.out.println("Quantidade pessoas: ");
            int quantidade_pessoas = teclado.nextInt();
            
            System.out.println("Energia renovavel?: [S/N]");
            boolean energia_renovavel = false;
            String resposta = teclado.next();
            if(resposta.equals("S")) {
                energia_renovavel = true;
            }
            System.out.println("Quantidade de lampadas na escola: ");
            int quantidade_lampadas = teclado.nextInt();
            System.out.println("Tem Ar condicionado?: [S/N]");
            boolean arCondicionado = false;
            resposta = teclado.next();
            if(resposta.equals("S")) {
                arCondicionado = true;
            }
            School s = new School(quantidade_pessoas, energia_renovavel, quantidade_lampadas, arCondicionado);
            lista_carbonfootprint.add(s);
        }
        for(int i = 0; i < 2; i++) {
            System.out.println("Combustivel: ");
            float combustivel = teclado.nextFloat();
            System.out.println("Cilindradas: ");
            float cilindradas = teclado.nextFloat();
            Car c = new Car(combustivel, cilindradas);
            lista_carbonfootprint.add(c);
        }
        for(int i = 0; i < 2; i++) {
            System.out.println("Modelo?: ");
            String modelo = teclado.next();
            System.out.println("Rodinha?: [S/N]");
            boolean rodinha = false;
            String resposta = teclado.next();
            if(resposta.equals("S")) {
                rodinha = true;
            }
            Bicycle b = new Bicycle(modelo, rodinha);
            lista_carbonfootprint.add(b);
        }
        for(int i = 0; i < lista_carbonfootprint.size(); i++) {
            System.out.println("CarbonFootprint: " + lista_carbonfootprint.get(i).getCarbonFootprint());
        }
    }
}