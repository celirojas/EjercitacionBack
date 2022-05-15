package com.company;

import java.time.LocalDate;

public class TarjetaDebito extends Tarjeta{
    Double saldoDisponible;

    public TarjetaDebito(int numerosFrente, int codigoSeguridad, LocalDate fechaExpiracion, Double saldoDisponible) {
        super(numerosFrente, codigoSeguridad, fechaExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public void procesarPago(double importe) {
        if(recibirAutorizacion() && importe < saldoDisponible){
            saldoDisponible -= importe;
            System.out.println("Se procesó el pago. Su saldo disponible es de: " + saldoDisponible);
        }
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

}
