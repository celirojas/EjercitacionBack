package com.dh.cajero.service.imp;

import com.dh.cajero.model.Vuelo;
import com.dh.cajero.service.IFacade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VueloService {

    private List<Vuelo>listadoVuelo = new ArrayList<>(); //Creamos un listado general de vuelos


//Implementamos el método buscarVuelo, que nos devolverá un listado de vuelos disponibles para los parámetros especificados.
    public List<Vuelo> buscarVuelo(LocalDate fechaSalida, String destino){ //Compara el vuelo seleccionado con el pasado por parámetro.
        List<Vuelo> vuelosDisponibles = new ArrayList<>(); //Los vuelos que estarán disponibles
        for (Vuelo vuelo:listadoVuelo) {
           if (vuelo.getFechaSalida().equals(fechaSalida) && vuelo.getDestino().equals(destino)){
               vuelosDisponibles.add(vuelo);
           }

        }
        return vuelosDisponibles;
    }

    public void agregarVuelo(Vuelo vuelo){ //Agregamos vuelos al listado general
        listadoVuelo.add(vuelo);
        System.out.println("Agregando vuelo al listado de vuelos");
    }

}
