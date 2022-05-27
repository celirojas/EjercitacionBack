import java.util.Date;

public class Credito extends Tarjeta{
    private double saldoUsado;
    private double limite;

    public Credito(int numeroFrente, int cvv, Date expiracion, double saldoUsado, double limite) {
        super(numeroFrente, cvv, expiracion);
        this.saldoUsado = saldoUsado;
        this.limite = limite;
    }

    public double getSaldoUsado() {
        return saldoUsado;
    }

    public void setSaldoUsado(double saldoUsado) {
        this.saldoUsado = saldoUsado;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    protected void pagar(double monto) {
        double saldo = limite - saldoUsado;
            boolean estaEnfecha = this.comprobarFecha();
            if (estaEnfecha) {
                if (saldo >= monto) {
                    saldoUsado += monto;
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else {
                System.out.println("Tarjeta vencida");
            }
    }

}
