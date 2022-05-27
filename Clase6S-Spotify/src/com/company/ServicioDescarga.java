package com.company;

public class ServicioDescarga implements DescargaSpotify{
    @Override
    public void descargar(Usuario usuario, String cancion) {
        System.out.println("El usuario de id: " + usuario.getId() + " descargó la canción: " + cancion );
    }
}
