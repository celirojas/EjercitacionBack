package com.dh.cajero.model;

import java.time.LocalDate;

public class Vuelo {
    private LocalDate fechaSalida;
    private LocalDate fechaRegreso;
    private String origen;
    private String destino;

    //Constructor
    public Vuelo(LocalDate fechaSalida, LocalDate fechaRegreso, String origen, String destino) {
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.origen = origen;
        this.destino = destino;
    }

    //Getters y setters
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(LocalDate fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    //Método toString para mostrar información.
    @Override
    public String toString() {
        return "Vuelo{" +
                "fechaSalida=" + fechaSalida +
                ", fechaRegreso=" + fechaRegreso +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
