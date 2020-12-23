public class Building extends CarbonFootprint{
    int quantidade_pessoas;
    boolean energia_renovavel;
    int quantidade_lampadas;
    boolean arCondicionado;
    public Building(int quantidade_pessoas, boolean energia_renovavel, int quantidade_lampadas, boolean arCondicionado) {
        this.quantidade_pessoas = quantidade_pessoas;
        this.energia_renovavel = energia_renovavel;
        this.quantidade_lampadas = quantidade_lampadas;
        this.arCondicionado = arCondicionado;
    }
    @Override
    public double getCarbonFootprint() {
        double carbonFootprint = this.quantidade_pessoas * this.quantidade_lampadas;
        return carbonFootprint;
    }
    public boolean getEnergiaRenovalvel() {
        return energia_renovavel;
    }
    public void setEnergiaRenovalvel(boolean energia_renovavel) {
        this.energia_renovavel = energia_renovavel;
    }
    public int getNumeroLampadas() {
        return quantidade_lampadas;
    }
    public int getNumeroPesosas() {
        return quantidade_pessoas;
    }
    public void setNumeroPesosas(int quantidade_pessoas) {
        this.quantidade_pessoas = quantidade_pessoas;
    }
    public void setNumeroLampadas(int quantidade_lampadas) {
        this.quantidade_lampadas = quantidade_lampadas;
    }
    public boolean getUsaArCondicionado() {
        return arCondicionado;
    }
    public void setUsaArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
}