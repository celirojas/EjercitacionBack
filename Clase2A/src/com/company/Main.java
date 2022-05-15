package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TarjetaDebito tarjetaDebito = new TarjetaDebito(123456, 153, LocalDate.of(2019,12,31), 100.0);
        TarjetaCredito tarjetaCredito = new TarjetaCredito(654321, 159, LocalDate.of(2019,12,31), 500.0, 0.0);
        tarjetaCredito.procesarPago(1000);
        tarjetaCredito.procesarPago(20);
        tarjetaDebito.procesarPago(50);
        tarjetaDebito.procesarPago(500);
    }
}
