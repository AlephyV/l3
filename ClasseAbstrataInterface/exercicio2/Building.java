package ex2;

public abstract class Building extends CarbonFootprint{
    int numeroPesosas;
    boolean energiaRenovalvel;
    int numeroLampadas;
    boolean usaArCondicionado;

    public Building(int numeroPesosas, boolean energiaRenovalvel, int numeroLampadas, boolean usaArCondicionado) {
        this.numeroPesosas = numeroPesosas;
        this.energiaRenovalvel = energiaRenovalvel;
        this.numeroLampadas = numeroLampadas;
        this.usaArCondicionado = usaArCondicionado;
    }

    public int getNumeroPesosas() {
        return numeroPesosas;
    }

    public void setNumeroPesosas(int numeroPesosas) {
        this.numeroPesosas = numeroPesosas;
    }

    public boolean isEnergiaRenovalvel() {
        return energiaRenovalvel;
    }

    public void setEnergiaRenovalvel(boolean energiaRenovalvel) {
        this.energiaRenovalvel = energiaRenovalvel;
    }

    public int getNumeroLampadas() {
        return numeroLampadas;
    }

    public void setNumeroLampadas(int numeroLampadas) {
        this.numeroLampadas = numeroLampadas;
    }

    public boolean isUsaArCondicionado() {
        return usaArCondicionado;
    }

    public void setUsaArCondicionado(boolean usaArCondicionado) {
        this.usaArCondicionado = usaArCondicionado;
    }

    @Override
    public double getCarbonFootprint() {
        double carbonFootprint = this.numeroPesosas + this.numeroLampadas;
        return carbonFootprint;
    }
}
