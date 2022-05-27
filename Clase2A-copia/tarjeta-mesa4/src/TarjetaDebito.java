import java.util.Date;

public class TarjetaDebito  extends Tarjeta{
    private float saldoDisponible;

    public TarjetaDebito(int numeros, int codigoDeSeguridad, int fechaDeExpiracion, float saldoDisponible) {
        super(numeros, codigoDeSeguridad, fechaDeExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    public float getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(float saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    protected void procesar(float valorPago) {

        if(this.validarFechaDeExpiracion()){
            if(valorPago <= this.saldoDisponible){
                System.out.println("Pago exitoso");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println( "Tarjeta rechazada, ya expiro");
        }
    }
}
