package com.company.cajero.service;

import com.company.cajero.model.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class CuentaService {

    //Este servicio se utiliza luego del servicio de autenticación.
    public Cuenta getCuenta(String dni){

        List<Cuenta> cuentas = CajeroService.getCuentas();

        Cuenta cuentaEncontrada = null;

        for (Cuenta cuenta: cuentas) {
            if(cuenta.getDni().equals(dni)) {
                cuentaEncontrada = cuenta;
            }
        }
        return cuentaEncontrada;
    }

}
