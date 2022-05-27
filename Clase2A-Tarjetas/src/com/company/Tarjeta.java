package com.company;

import java.time.LocalDate;

public abstract class Tarjeta {
    private int numerosFrente;
    private int codigoSeguridad;
    private LocalDate fechaExpiracion;

    public Tarjeta(int numerosFrente, int codigoSeguridad, LocalDate fechaExpiracion) {
        this.numerosFrente = numerosFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaExpiracion = fechaExpiracion;
    }

    public abstract void procesarPago(double importe);

    public Boolean recibirAutorizacion(){
        int diferencia = fechaExpiracion.getYear() - LocalDate.now().getYear();
        if(diferencia > 0){
            System.out.println("Pago autorizado");
        } else {
            System.out.println("Pago no autorizado");
        }
        return diferencia > 0;
    }

}
