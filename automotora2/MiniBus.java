package cl.desafios.automotora2;

public class MiniBus extends Bus {
    private String tipoViaje;

    public MiniBus() {
    }

    public MiniBus(String color, String patente, Integer cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "MiniBus{" +
                "tipoViaje='" + tipoViaje + '\'' +
                '}';
    }
}
