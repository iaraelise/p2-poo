public class Consumo {
    private double distancia;
    private double combustivelGasto;

    public Consumo (double distancia, double combustivelGasto) {
        this.distancia = distancia;
        this.combustivelGasto = combustivelGasto;
    }

    public double consumoMedio() {
        return this.distancia / this.combustivelGasto;
    }
}
