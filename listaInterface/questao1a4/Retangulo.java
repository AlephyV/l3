public class Retangulo implements ObjetoGeometrico {
    private int altura;
    private int base;
    public Retangulo(int base, int altura) {
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public double calcularPerimetro() {
        return (2*this.base) + (2*this.altura);
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getAltura() {
        return altura;
    }
}