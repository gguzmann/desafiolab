package cl.desafios.automotora2;

public class Taxi extends Vehiculo {
    private int valorPasaje;

    public Taxi() {
    }

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int PagarPasaje(int monto) {
        System.out.println("Pagar pasaje");
        return monto > getValorPasaje() ? monto - getValorPasaje() : getValorPasaje();
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "valorPasaje=" + valorPasaje +
                '}';
    }
}
