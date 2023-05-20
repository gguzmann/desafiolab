package cl.desafios.automotora2;

public class TestMain {
    public static void main(String[] args) {
        MiniBus mb = new MiniBus("rojo", "h231j", 2, "Local");
        mb.imprimeBus();
        Taxi taxi = new Taxi("negro", "asdasd", 10);
        System.out.println(taxi.PagarPasaje(15));
    }
}
