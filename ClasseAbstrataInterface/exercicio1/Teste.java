public class Teste {
    public static void main(String args[]) {
        ArrayList<CarbonFootprint> lista_carbonfootprint = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 2; i++) {
            System.out.println("Quantidade pessoas: ");
            int numeroPessoas = teclado.nextInt();
            System.out.println("Energia é renovavel?: [S/N]");
            boolean energia_renovavel = false;
            String resposta = teclado.next();
            if(resposta.equals("S")) {
                energia_renovavel = true;
            }
            System.out.println("Quantidade de Lampadas que tem na cidade: ");
            int numero_lampadas = teclado.nextInt();
            System.out.println("Ar condicionado?: [S/N]");
            boolean arCondicionado = false;
            resposta = teclado.next();
            if(resposta.equals("S")) {
                arCondicionado = true;
            }
            Building b = new Building(numeroPessoas, energia_renovavel, numero_lampadas, arCondicionado);
            lista_carbonfootprint.add(b);
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
            System.out.println("Modelo: ");
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