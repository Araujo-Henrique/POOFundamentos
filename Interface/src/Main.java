public class Main {
    public static void main(String[] args) {
        ViagemPagavel uberX = new ViagemUberX(10); // Viagem de 10km
        System.out.println("Tarifa UberX: R$" + uberX.calcularTarifa());

        ViagemPagavel uberBlack = new ViagemUberBlack(10); // Viagem de 10km
        System.out.println("Tarifa UberBlack: R$" + uberBlack.calcularTarifa());
    }
}