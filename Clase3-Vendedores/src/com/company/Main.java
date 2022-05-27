package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Vendedor vendedor1 = new Empleado("Victor", 2020);
       vendedor1.mostrarCategoria();
       vendedor1.vender();
       vendedor1.mostrarCategoria();
       ((Empleado) vendedor1).conseguirAfiliados(new Afiliado("Mar")); //Estoy accediendo a vendedor, entonces tengo que pasarlo a empleado para acceder al método.
       vendedor1.mostrarCategoria();

       Afiliado afiliado1 = new Afiliado("Toto");
       afiliado1.vender();
       afiliado1.mostrarCategoria();
    }
}
