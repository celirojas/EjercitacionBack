package com.company.cajero.service;

import com.company.cajero.model.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class CajeroService implements ICajeroService{
    //Atributos: los tres subsistemas.
    private AutenticationService autenticationService;
    private CuentaService cuentaService;
    private CajaService cajaService;
    private static List<Cuenta> cuentas;

    //Constructor
    public CajeroService(AutenticationService autenticationService, CuentaService cuentaService, CajaService cajaService) {
        this.autenticationService = autenticationService;
        this.cuentaService = cuentaService;
        this.cajaService = cajaService;
        this.cuentas = new ArrayList<>(); //Instanciamos un array de cuentas.
    }

    //Método para obtener las cuentas disponibles.
    public static List<Cuenta> getCuentas() {
        return cuentas;
    }

    //Método para agregar las cuentas disponibles.
    public void agregarCuentas(Cuenta cuenta){
        cuentas.add(cuenta);
    }

    @Override
    public void retirarDinero(String dni, String contrasenia, double importe) {
        boolean next = false;
        if(autenticationService.validarUsuarioYContrasenia(dni,contrasenia)){ // Primero valido que el usuario y la contraseña sean válidos
            next = true;
        }
        Cuenta cuentaEncontrada = null;
        if(next){
            cuentaEncontrada = cuentaService.getCuenta(dni); //Obtengo la cuenta
        }
        if(cuentaEncontrada != null){
            if(cuentaEncontrada.getSaldoActual() - importe >= 0){ //Chequeo que tenga saldo
                cuentaEncontrada.setSaldoActual(cuentaEncontrada.getSaldoActual()-importe); //Le resto el importe
                System.out.println("A la cuenta " + cuentaEncontrada.getDni() + " le queda: " + cuentaEncontrada.getSaldoActual() + " de saldo disponible");
                cajaService.entregarDinero(importe); //Utilizo el método entregarDinero de cajaService
            } else {
                System.out.println("Usted no cuenta con dinero suficiente.");
            }



        }
    }
}
