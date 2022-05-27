import java.util.Date;

public class TarjetaCredito  extends Tarjeta{
    private float saldoUtilizado;
    private float limite;

    public TarjetaCredito(int numeros, int codigoDeSeguridad, int fechaDeExpiracion, float saldoUtilizado, float limite) {
        super(numeros, codigoDeSeguridad, fechaDeExpiracion);
        this.saldoUtilizado = saldoUtilizado;
        this.limite = limite;
    }

    public float getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(float saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    protected void procesar(float valorPago) {

        if(this.validarFechaDeExpiracion()){
           if(valorPago <= (this.limite- this.saldoUtilizado)){
                   System.out.println("Pago exitoso");
               }else{
                System.out.println("Saldo insuficiente");
           }
        }else{
            System.out.println( "Tarjeta rechazada, ya expiro");
        }
    }
}
