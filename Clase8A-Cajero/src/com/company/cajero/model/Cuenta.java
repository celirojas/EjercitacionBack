package com.company.cajero.model;

public class Cuenta {
    private String dni;
    private double saldoActual;
    private String contrasenia;

    //Constructor

    public Cuenta(String dni, double saldoActual, String contrasenia) {
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.contrasenia = contrasenia;
    }

    //Getters y setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    //ToString

    @Override
    public String toString() {
        return "La cuenta del dni: " + getDni() + " tiene un saldo disponible de: " + getSaldoActual();
    }
}
