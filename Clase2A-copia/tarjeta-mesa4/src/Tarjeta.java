import java.time.LocalDateTime;
import java.util.Date;

public abstract class Tarjeta {

    private int numeros;
    private int codigoDeSeguridad;
    private int fechaDeExpiracion;

    protected abstract void procesar(float valorPago);

    public Tarjeta(int numeros, int codigoDeSeguridad, int fechaDeExpiracion) {
        this.numeros = numeros;
        this.codigoDeSeguridad = codigoDeSeguridad;
        this.fechaDeExpiracion = fechaDeExpiracion;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public int getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }

    public void setCodigoDeSeguridad(int codigoDeSeguridad) {
        this.codigoDeSeguridad = codigoDeSeguridad;
    }

    public int getFechaDeExpiracion() {
        return fechaDeExpiracion;
    }

    public void setFechaDeExpiracion(int fechaDeExpiracion) {
        this.fechaDeExpiracion = fechaDeExpiracion;
    }

    public boolean validarFechaDeExpiracion(){
        return this.fechaDeExpiracion > 2022;
    };
}
