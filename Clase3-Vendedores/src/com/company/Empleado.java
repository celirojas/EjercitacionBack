package com.company;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empleado extends Vendedor {
    private int anioIngreso;
    private List<Afiliado> afiliados = new ArrayList<>();

    //Constructor

    public Empleado(String nombre, int anioIngreso) {
        super(nombre);
        this.anioIngreso = anioIngreso;
        calcularAntiguedad();
    }


    //Getters y setters
    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    //Override

    @Override
    public void vender() {
        System.out.println("Usted ha hecho una venta");
        puntos += 5;

    }

    //Le agrega la antiguedad cada vez que calcula los puntos.
    @Override
    public int calcularPuntos() {
        return puntos;
    }
    //Métodos

    public void conseguirAfiliados(Afiliado afiliado){
        System.out.println(super.getNombre() + " añadió un afiliado.");
        afiliados.add(afiliado);
        puntos += 10;
    }

    public int calcularAntiguedad() {
        int anio = LocalDate.now().getYear();
        int diferencia = anio - this.getAnioIngreso();
        return puntos += diferencia * 5;
    }


}
