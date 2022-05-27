package com.dh.cajero.service.imp;

import com.dh.cajero.model.Hotel;
import com.dh.cajero.model.Vuelo;
import com.dh.cajero.service.IFacade;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.util.List;

public class FacadeImpl  implements IFacade {
    private VueloService vueloService; //Tenemos los dos servicios como atributos
    private HotelService hotelService;

    //Constrctor de la fachada
    public FacadeImpl(VueloService vueloService, HotelService hotelService) {
        this.vueloService = vueloService;
        this.hotelService = hotelService;
    }

    //Getters de los servicios.
    public VueloService getVueloService() {
        return vueloService;
    }

    public HotelService getHotelService() {
        return hotelService;
    }

    //Este método utilizará los dos servicios para buscar vuelo y hotel
    @Override
    public void buscarHotelYVuelo(String ciudad, LocalDate fechaSalida) {
        List<Vuelo> vuelos = vueloService.buscarVuelo(fechaSalida, ciudad);
        List<Hotel> hoteles = hotelService.buscarHotel(fechaSalida, ciudad);

        for (Vuelo vuelo:vuelos) {
            System.out.println("Buscando vuelos disponibles...");
            System.out.println("Vuelo disponible:");
                System.out.println(vuelo.toString()); //Mostramos la información de los vuelos disponibles
        }
        for (Hotel hotel: hoteles) {
            System.out.println(hotel.toString()); //Mostramos la información de los hoteles disponibles
        }

    }
}
