package cl.desafios.automotora2;

public class Bus extends Vehiculo {
    private Integer cantidadDeAsientos;

    public Bus() {
    }

    public Bus(String color, String patente, Integer cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public Integer getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(Integer cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public Integer asientosDisponibles() {
        return getCantidadDeAsientos();
    }

    @Override
    public String toString() {
        return super.toString() + "Bus{" +
                "cantidadDeAsientos=" + cantidadDeAsientos +
                '}';
    }
}
