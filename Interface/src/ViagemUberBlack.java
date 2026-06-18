public class ViagemUberBlack implements ViagemPagavel {
    private double distancia;

    public ViagemUberBlack(double distancia) {
        this.distancia = distancia;
    }

    public double calcularTarifa() {
        // Supondo que a tarifa do UberBlack seja de R$1,50 por km.
        return this.distancia * 1.50;
    }
}
