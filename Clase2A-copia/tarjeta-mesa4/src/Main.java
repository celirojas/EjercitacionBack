import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Tarjeta tarjetaDebito = new TarjetaDebito(123456, 123, 2019, 1000000);
        Tarjeta tarjetaCredito = new TarjetaCredito(123456, 123, 2029, 2000000, 4000000);
        tarjetaDebito.procesar(120000);
        tarjetaCredito.procesar(500000);
    }
}
