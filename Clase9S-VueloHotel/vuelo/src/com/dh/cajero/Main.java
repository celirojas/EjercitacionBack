package com.dh.cajero;

import com.dh.cajero.model.Hotel;
import com.dh.cajero.model.Vuelo;
import com.dh.cajero.service.imp.FacadeImpl;
import com.dh.cajero.service.imp.HotelService;
import com.dh.cajero.service.imp.VueloService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Instanciamos dos vuelos
        Vuelo vuelo1 = new Vuelo(LocalDate.of(2022, 05, 25 ),LocalDate.of(2022, 06, 05),"Argentina", "Colombia");
        Vuelo vuelo2 = new Vuelo(LocalDate.of(2022, 06, 10 ),LocalDate.of(2022, 06, 30),"Colombia", "Bahamas");

        //Instanciamos dos hoteles
        Hotel hotel1 = new Hotel(LocalDate.of(2022, 05,25 ),LocalDate.of(2022, 06, 07),"Colombia");
        Hotel hotel2 = new Hotel(LocalDate.of(2022, 05,25 ),LocalDate.of(2022, 06, 07),"Bahamas");

        //Instanciamos una fachada y sus atributos
        FacadeImpl facade = new FacadeImpl(new VueloService(), new HotelService());

        //A través de la fachada utilizamos los servicios de vuelo y hotel, agregamos los hoteles y vuelos
        //al listado general
        facade.getHotelService().agregarHotel(hotel1);
        facade.getHotelService().agregarHotel(hotel2);
        facade.getVueloService().agregarVuelo(vuelo1);
        facade.getVueloService().agregarVuelo(vuelo2);

        //A través de la fachada buscamos el hotel y vuelo disponibles
        facade.buscarHotelYVuelo("Colombia", LocalDate.of(2022, 06, 05));

    }
}
