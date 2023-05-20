package cl.desafios.automotora2;

public class Persona {
    private String rut;
    private String nombre;

    public Persona() {
    }

    public Persona(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
