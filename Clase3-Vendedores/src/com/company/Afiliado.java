package com.company;

public class Afiliado extends Vendedor{


    public Afiliado(String nombre) {
        super(nombre);
    }

    @Override
    public void vender() {
        System.out.println(super.getNombre() + " ha realizado una nueva venta.");
        puntos += 15;
    }

    @Override
    public int calcularPuntos() {
        return this.puntos;
    }
}
