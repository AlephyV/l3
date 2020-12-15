
package ex2;

public class Car extends CarbonFootprint{
    float combustivel;
    float cilindrada;

    public Car(float combustivel, float cilindrada) {
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }

    public float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double getCarbonFootprint() {
        double carbonFootprint = this.cilindrada + this.combustivel;
        return carbonFootprint;
    }
    
}
