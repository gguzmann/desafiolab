package cl.prueba.modelo;

public class Cliente {
    private String run;
    private String nombre;
    private String apellido;
    private String anios;
    private Enum<CategoriaEnum> categoria;

    public Cliente() {
    }

    public Cliente(String run, String nombre, String apellido, String anios, Enum<CategoriaEnum> categoria) {
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anios = anios;
        this.categoria = categoria;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAnios() {
        return anios;
    }

    public void setAnios(String anios) {
        this.anios = anios;
    }

    public Enum<CategoriaEnum> getCategoria() {
        return categoria;
    }

    public void setCategoria(Enum<CategoriaEnum> categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "run='" + run + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", anios='" + anios + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
