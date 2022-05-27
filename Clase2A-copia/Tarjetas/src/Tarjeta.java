import java.util.Date;

public abstract class Tarjeta {
    private int numeroFrente;
    private int cvv;
    private Date expiracion;

    public Tarjeta(int numeroFrente, int cvv, Date expiracion) {
        this.numeroFrente = numeroFrente;
        this.cvv = cvv;
        this.expiracion = expiracion;
    }

    public int getNumeroFrente() {
        return numeroFrente;
    }

    public void setNumeroFrente(int numeroFrente) {
        this.numeroFrente = numeroFrente;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(Date expiracion) {
        this.expiracion = expiracion;
    }

    public boolean comprobarFecha() {
        Date today = new Date();
        return (today.before(expiracion));

    };

    protected abstract void pagar(double monto);
}




