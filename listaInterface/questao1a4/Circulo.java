public class Circulo implements ObjetoGeometrico {
    private double pi;
    private double raio;
    public Circulo(double raio, double pi) {
        this.pi = pi;
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return this.pi * Math.pow(this.raio, 2);
    }
    public double getpi() {
        return pi;
    }
    public void setpi(double pi) {
        this.pi = pi;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * this.pi * this.raio;
    }
}