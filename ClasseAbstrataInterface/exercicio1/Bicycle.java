
package l1;


public class Bicycle extends CarbonFootprint {
    String modelo;
    boolean temRodinha;

    public Bicycle(String modelo, boolean temRodinha) {
        this.modelo = modelo;
        this.temRodinha = temRodinha;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTemRodinha() {
        return temRodinha;
    }

    public void setTemRodinha(boolean temRodinha) {
        this.temRodinha = temRodinha;
    }
    
    @Override
    public double getCarbonFootprint() {
        double carbonFootprint = 0;
        return carbonFootprint;
    }
    
}
