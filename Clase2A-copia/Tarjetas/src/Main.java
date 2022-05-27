import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Credito tarjetaCredito = new Credito(1234, 123,new Date(130,1,23),4564.30,30000);
        Debito tarjetaDebito= new Debito(12345,123, new Date(102,2,4),50000);

        tarjetaCredito.pagar(1000.00);
        System.out.println(tarjetaCredito.getSaldoUsado());
        tarjetaDebito.pagar(123.30);
    }
}
