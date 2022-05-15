package com.company;

import java.time.LocalDate;

public class TarjetaCredito extends Tarjeta{
    Double limite;
    Double saldoUtilizado;

    public TarjetaCredito(int numerosFrente, int codigoSeguridad, LocalDate fechaExpiracion, Double limite, Double saldoUtilizado){
        super(numerosFrente, codigoSeguridad, fechaExpiracion);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    public void procesarPago(double importe) {
        if(recibirAutorizacion() && importe < limite){
            saldoUtilizado += importe;
            System.out.println("Se procesó el pago. Su saldo utilizado es de: " + saldoUtilizado);
        }
    }
}
