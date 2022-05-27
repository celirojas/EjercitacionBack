package com.dh.flyweigth.model;

public class Arbol {

    private TipoArbol tipoArbol; //Con un enum declaramos los tipos de árbol.


    public Arbol(TipoArbol tipoArbol) {
        this.tipoArbol = tipoArbol;
    } //Constructor.

    //Getter & setter
    public TipoArbol getTipoArbol() {
        return tipoArbol;
    }
    public void setTipoArbol(TipoArbol tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

}
