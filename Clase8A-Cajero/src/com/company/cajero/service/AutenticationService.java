package com.company.cajero.service;

import com.company.cajero.model.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class AutenticationService {
    //Validamos las credenciales de la cuenta

    public static boolean validarUsuarioYContrasenia(String dni, String contrasenia){
        List<Cuenta> cuentas = CajeroService.getCuentas();   //Obtenemos las cuentas disponibles.

        boolean cuentaEncontrada = false;
        for (Cuenta cuenta: cuentas){ //Recorremos las cuentas y nos fijamos si el dni y la contraseña son correctos.
            if(cuenta.getDni().equals(dni) && cuenta.getContrasenia().equalsIgnoreCase(contrasenia)){
                System.out.println("Cuenta válida...");
                cuentaEncontrada = true;
            } else {
                System.out.println("Usted no tiene una cuenta");
                cuentaEncontrada = false;
            }
        }
        return cuentaEncontrada;

        //return cuentas.stream().anyMatch(cuenta -> cuenta.getDni().equals(dni) && cuenta.getContrasenia().equalsIgnoreCase(contrasenia));
    }


}
