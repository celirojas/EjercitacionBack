package com.company.cajero;

import com.company.cajero.model.Cuenta;
import com.company.cajero.service.AutenticationService;
import com.company.cajero.service.CajaService;
import com.company.cajero.service.CajeroService;
import com.company.cajero.service.CuentaService;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AutenticationService autenticationService = new AutenticationService();
        CuentaService cuentaService = new CuentaService();
        CajaService cajaService = new CajaService();

        CajeroService cajero = new CajeroService(autenticationService, cuentaService, cajaService);

        Cuenta cuenta1 = new Cuenta("35334508", 1000.0,"tomate");
        cajero.agregarCuentas(cuenta1);
        cajero.retirarDinero("35334508","tomate",900.0);




    }
}
