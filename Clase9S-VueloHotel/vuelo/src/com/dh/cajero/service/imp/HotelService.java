package com.dh.cajero.service.imp;

import com.dh.cajero.model.Hotel;
import com.dh.cajero.model.Vuelo;
import com.dh.cajero.service.IFacade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelService {

    private List<Hotel>listadoHotel = new ArrayList<>(); //Instanciamos nuestro listado general de hoteles


    public List<Hotel> buscarHotel(LocalDate fechaSalida, String ciudad){ //Compara el hotel seleccionado con el pasado por parámetro.
        List<Hotel> hotelesDisponibles = new ArrayList<>(); //Listado de hoteles disponibles.
        for (Hotel hotel:listadoHotel) {
            if (hotel.getFechaSalida().equals(fechaSalida) && hotel.getCiudad().equals(ciudad)){
                hotelesDisponibles.add(hotel);
            }

        }
        return hotelesDisponibles;
    }
    public void agregarHotel(Hotel hotel){ //Método para agregar hotel al listado general.
        listadoHotel.add(hotel);
        System.out.println("Agregando un hotel al listado de hoteles");
    }


}
