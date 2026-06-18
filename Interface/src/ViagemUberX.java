public class ViagemUberX implements ViagemPagavel {
    private double distancia;

    public ViagemUberX(double distancia) {
        this.distancia = distancia;
    }

    public double calcularTarifa() {
        // Supondo que a tarifa do UberX seja de R$1,00 por km.
        return this.distancia * 1.00;
    }
}