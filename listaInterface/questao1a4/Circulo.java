
package q1;


public class Circulo implements ObjetoGeometrico {
    private double raio;
    private double PI;

    public Circulo(double raio, double PI) {
        this.raio = raio;
        this.PI = PI;
    }

    @Override
    public double calcularArea() {
        return this.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * this.PI * this.raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }
    
}
