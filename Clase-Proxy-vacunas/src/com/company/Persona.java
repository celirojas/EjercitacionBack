package com.company;

import java.util.Date;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String nombreVacuna;
    private Date fechaAsignada;

    public Persona(String dni, String nombre, String apellido, String nombreVacuna, Date fechaAsignada) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreVacuna = nombreVacuna;
        this.fechaAsignada = fechaAsignada;
    }

    //Getters y setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public Date getFechaAsignada() {
        return fechaAsignada;
    }

    public void setFechaAsignada(Date fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }
}
