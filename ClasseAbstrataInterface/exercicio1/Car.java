public class Car extends CarbonFootprint{
    float cilindrada;
   float combustivel;
   public Car(float combustivel, float cilindrada) {
       this.cilindrada = cilindrada;
       this.combustivel = combustivel;
   }
   public float getCombustivel() {
       return combustivel;
   }
   @Override
   public double getCarbonFootprint() {
       double carbonFootprint = this.cilindrada * this.combustivel;
       return carbonFootprint;
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
}