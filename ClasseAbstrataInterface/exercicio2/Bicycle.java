public class Bicycle extends CarbonFootprint {
    boolean tem_rodinha;
    String modelo;
    @Override
    public double getCarbonFootprint() {
        double carbonFootprint = 0;
        return carbonFootprint;
    }
    public Bicycle(String modelo, boolean rodinha) {
        this.modelo = modelo;
        this.tem_rodinha = rodinha;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean getTemRodinha() {
        return tem_rodinha;
    }
    public void setTemRodinha(boolean tem_rodinha) {
        this.tem_rodinha = tem_rodinha;
    }
}