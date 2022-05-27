package com.dh.banco.service;

//La clase manejadora es la responsable de comenzar la cadena con ella, en este caso, EmpleadoBanco.
public abstract class EmpleadoBanco {

    protected EmpleadoBanco sigEmpleadoBanco;

    public abstract void procesarSolicitud(Integer monto);

    public EmpleadoBanco setSigEmpleadoBanco(EmpleadoBanco sigEmpleadoBanco) {
        this.sigEmpleadoBanco = sigEmpleadoBanco;
        return this;
    }
}
