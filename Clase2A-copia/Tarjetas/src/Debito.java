import java.util.Date;

public class Debito extends Tarjeta {
    private double saldo;

    public Debito(int numeroFrente, int cvv, Date expiracion, double saldo) {
        super(numeroFrente, cvv, expiracion);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    protected void pagar(double monto) {
        boolean estaEnfecha = this.comprobarFecha();
        if (estaEnfecha) {
            if (saldo >= monto) {
                saldo -= monto;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Tarjeta vencida");
        }
    }
}
